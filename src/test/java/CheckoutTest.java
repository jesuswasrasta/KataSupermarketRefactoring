import org.junit.Before;
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

    private Checkout checkout;

    @Before
    public void before(){
        checkout = new Checkout();
    }

    @Test
    public void apple() {
        //Arrange
        List<String> il = new ArrayList<>();
        il.add("apple");
        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();

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

        int result = checkout.pay(itemsList, offers);

        assertEquals(220, result);
    }

    @Test
    public void aBananaCosts60() throws Exception {

        List<String> itemsList = new ArrayList<>();
        itemsList.add("banana");

        Map<String, Entry<Integer, Integer>> offers = new HashMap<>();
        offers.put("banana", new SimpleEntry<>(1, 60));

        int result = checkout.pay(itemsList, offers);

        assertEquals(60, result);
    }

    @Test
    public void fruits() {
        List<String> itemList = new ArrayList<>();
        itemList.add("apple");
        itemList.add("pear");
        itemList.add("apple");
        itemList.add("pear");
        itemList.add("lychee");
        itemList.add("apple");
        itemList.add("banana");
        itemList.add("pineapple");

        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();
        ll.put("apple", new SimpleEntry<>(3, 130));
        ll.put("pear", new SimpleEntry<>(2, 45));

        int result = checkout.pay(itemList, ll);

        assertEquals(455, result);
    }
}