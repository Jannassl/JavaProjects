import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class GroceryListManager {
    Map<String, Double> products = new HashMap<>();
    Map<String, String> categories = new HashMap<>();

    public void addItem(String item, double price){
        products.put(item, price);
    }

    public void addItemWithCategory(String item, String category) {
        // Assign the item to the specified category
        categories.put(item, category);
    }

    public void removeItem(String item){
        products.remove(item);
        System.out.println("Removing " + item +" from the list...");
        System.out.println(" ");
        System.out.println("Updated Grocery list:");
        displayList();
    }

    public void displayList(){
        int i = 1;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String name = entry.getKey();
            double product = entry.getValue();
            System.out.println(i + "." + name +", " + product + "€");
            i++;
        }
    }
    public boolean checkItem(String item) {
        System.out.println("Is "+ item + " in the grocery list? "+ products.containsKey(item));
        return products.containsKey(item);
    }

    public double calculateTotalCost(){
        double sum = 0;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            double product = entry.getValue();
            sum += product;
        }
        System.out.println("Total is: "+ sum+ "€");
        return sum;
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category " + category + ":");
        List<String> itemsInCategory = new ArrayList<>();
        for (Map.Entry<String, String> entry : categories.entrySet()) {
            String item = entry.getKey();
            String itemCategory = entry.getValue();
            if (itemCategory.equals(category)) {
                itemsInCategory.add(item);
            }
        }
        if (itemsInCategory.isEmpty()) {
            System.out.println("No items found in category " + category);
        } else {
            for (String item : itemsInCategory) {
                System.out.println("- " + item);
            }
        }
    }

    public static void main(String [] args){
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("Apples", 1);
        manager.addItem("Milk", 2);
        manager.addItem("Bread", 4.5);

        manager.addItemWithCategory("Apples", "Fruits");
        manager.addItemWithCategory("Milk", "Dairy");
        manager.addItemWithCategory("Bread", "Bakery");

        manager.displayList();

        manager.checkItem("Milk");

        manager.removeItem("Milk");

        manager.calculateTotalCost();

        manager.displayByCategory("Fruits");
    }
}
