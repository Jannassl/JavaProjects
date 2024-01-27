import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class GroceryListManager {
    Map<String, Double> products = new HashMap<>();
    Map<String, String> categories = new HashMap<>();
    Map<String, Integer> quantities = new HashMap<>();
    public class ShoppingList{
        private String purpose;
        private ArrayList<String> items;

        public ShoppingList(String purpose) {
            this.purpose = purpose;
            this.items = new ArrayList<>();
        }
        public void addItem(String item) {
            items.add(item);
            System.out.println("Added " + item + " to " + purpose + " list.");
        }

        public void removeItem(String item) {
            if (items.contains(item)) {
                items.remove(item);
                System.out.println("Removed " + item + " from " + purpose + " list.");
            } else {
                System.out.println(item + " is not in the " + purpose + " list.");
            }
        }

        public void displayList() {
            System.out.println("Shopping List for " + purpose + ":");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    public void addItem(String item, double price){
        products.put(item, price);
    }


    public void addItemWithCategory(String item, String category) {
        categories.put(item, category);
    }

    public void addItemWithQuantity(String item, int quantity) {
        quantities.put(item, quantity);
    }

    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
            System.out.println("Quantity of " + item + " updated to " + newQuantity);
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    public void removeItem(String item){
        products.remove(item);
        categories.remove(item);
        quantities.remove(item);
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
            int quantity = quantities.getOrDefault(name, 0);
            System.out.println(i + "." + name + ", " + product + "€, Quantity: " + quantity);
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
            sum += product * quantities.getOrDefault(entry.getKey(), 0);
        }
        System.out.println("Total is: "+ sum+ "€");
        return sum;
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (Map.Entry<String, Integer> entry : quantities.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
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

        manager.addItemWithQuantity("Apples", 5);
        manager.addItemWithQuantity("Milk", 3);
        manager.addItemWithQuantity("Bread", 2);

        manager.displayList();

        manager.checkItem("Milk");

        manager.removeItem("Milk");

        manager.calculateTotalCost();

        manager.displayAvailableItems();
    }
}
