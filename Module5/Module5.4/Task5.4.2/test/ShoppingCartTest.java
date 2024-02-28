import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


class ShoppingCartTest {

    @Test
    public void testAddItems(){
        ShoppingCart cart = new ShoppingCart();
        cart.addItems("Banana",2);
        HashMap<String, Integer> expectedItems = new HashMap<>();
        expectedItems.put("Banana",2);
        assertEquals(expectedItems, cart.getOstokset());

    }

    @Test
    public void testRemoveItems(){
        ShoppingCart cart = new ShoppingCart();
        cart.addItems("Banana", 3);
        cart.addItems("Apple", 2);
        cart.removeItems("Apple");

        HashMap<String, Integer> expectedItems = new HashMap<>();
        expectedItems.put("Banana", 3);
        assertEquals(expectedItems, cart.getOstokset());

    }

    @Test
    public void testCalculateCost(){
        ShoppingCart cart = new ShoppingCart();
        cart.addItems("Banana", 4);
        cart.addItems("Apple", 2);

        assertEquals(cart.calculateCosts(), 6);
    }

}