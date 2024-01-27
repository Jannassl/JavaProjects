import java.util.HashMap;
import java.util.Map;
public class GroceryListManager {
    Map<String, Double> products = new HashMap<>();

    public void addItem(String item, double price){
        products.put(item, price);

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
            System.out.println(i + "." +name +", " + product+ "€");
        }
    }
    public boolean checkItem(String item) {
        System.out.println("Is "+ item + " in the grocerylist? "+ products.containsKey(item));
        return products.containsKey(item);

    }
    public double calculateTotalCost(){
        double sum = 0;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String name = entry.getKey();
            double product = entry.getValue();
            sum += product;
        }
        System.out.println("Total is: "+ sum+ "€");
        return sum;
    }
    public static void main(String [] args){
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("Apples", 1);
        manager.addItem("Milk", 2);
        manager.addItem("Bread",4.5);

        manager.displayList();

        manager.checkItem("Milk");

        manager.removeItem("Milk");
        manager.calculateTotalCost();
    }
}

