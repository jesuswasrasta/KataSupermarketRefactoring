import org.junit.Test;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CheckoutTest {
    @Test
    public void apple() {
        //Arrange
        List<String> il = new ArrayList<>();
        il.add("apple");
        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();
        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(il, ll);

        //Assert
        assertEquals(50, result);
    }

    @Test
    public void aPineappleCosts220() throws Exception {
        List<String> itemsList = new ArrayList<>();
        itemsList.add("pineapple");

        Map<String, Entry<Integer, Integer>> offers = new HashMap<>();
        offers.put("pineapple", new SimpleEntry<>(1, 220));

        Checkout checkout = new Checkout();

        int result = checkout.pay(itemsList, offers);

        assertEquals(220, result);
    }

    @Test
    public void aBananaCosts60() throws Exception {
        List<String> itemsList = new ArrayList<>();
        itemsList.add("banana");

        Map<String, Entry<Integer, Integer>> offers = new HashMap<>();
        offers.put("banana", new SimpleEntry<>(1, 60));

        Checkout checkout = new Checkout();

        int result = checkout.pay(itemsList, offers);

        assertEquals(60, result);
    }

    @Test
    public void fruits() {
        //Arrange
        List<String> it = new ArrayList<>();
        it.add("apple");
        it.add("pear");
        it.add("apple");
        it.add("pear");
        it.add("lychee");
        it.add("apple");
        it.add("banana");
        it.add("pineapple");

        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();
        ll.put("apple", new SimpleEntry<>(3, 130));
        ll.put("pear", new SimpleEntry<>(2, 45));

        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(it, ll);

        //Assert
        assertEquals(455, result);
    }
}