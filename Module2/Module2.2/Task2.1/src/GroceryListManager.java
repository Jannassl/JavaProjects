import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);

    }
    public void removeItem(String item){
        groceryList.remove(item);
        System.out.println("Removing " + item +" from the list...");
        System.out.println(" ");
        System.out.println("Updated Grocery list:");
        displayList();
    }
    public void displayList(){
        int i = 1;
        for(String grocery : groceryList){
            System.out.println(i+". " +grocery);
            i ++;
        }
    }
    public boolean checkItem(String item) {
        System.out.println("Is "+ item + " in the grocerylist? "+ groceryList.contains(item));
        return groceryList.contains(item);

    }
    public static void main(String [] args){
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        manager.displayList();

        manager.checkItem("Milk");

        manager.removeItem("Milk");

    }
}

