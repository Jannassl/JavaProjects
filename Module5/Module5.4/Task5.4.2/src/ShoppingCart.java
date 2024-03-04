import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private HashMap<String, Integer> ostokset;

    public ShoppingCart() {
        this.ostokset = new HashMap<>();
    }

    public void addItems(String item, int cost) {
        item.toLowerCase();
        ostokset.put(item, cost);
    }

    public HashMap<String, Integer> getOstokset() {
        return ostokset;
    }

    public void removeItems(String item) {
        item.toLowerCase();
        ostokset.remove(item);
    }

    public int calculateCosts() {
        int result = 0;

        for (Map.Entry<String, Integer> entry : ostokset.entrySet()) {
            int cost = entry.getValue();
            result += cost;

        }
        return result;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItems("Banana",5);
        cart.addItems("Apple", 5);

    }
}
