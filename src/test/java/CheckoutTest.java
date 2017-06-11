import org.junit.Test;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();
        ll.put("apple", new SimpleEntry<>(3, 130));
        ll.put("pear", new SimpleEntry<>(2, 45));

        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(it, ll);

        //Assert
        assertEquals(235, result);
    }
}