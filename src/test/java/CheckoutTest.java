import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
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
        List<String> il = forFruits("apple");
        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();

        //Act
        int result = checkout.pay(il, ll);

        //Assert
        assertEquals(50, result);
    }

    @Test
    public void aPineappleCosts220() throws Exception {
        List<String> itemsList = forFruits("pineapple");

        Map<String, Entry<Integer, Integer>> offers = new HashMap<>();
        offers.put("pineapple", new SimpleEntry<>(1, 220));

        int result = checkout.pay(itemsList, offers);

        assertEquals(220, result);
    }

    @Test
    public void aBananaCosts60() throws Exception {

        Map<String, Entry<Integer, Integer>> withOffers = new HashMap<>();
        withOffers.put("banana", new SimpleEntry<>(1, 60));

        int result = checkout.pay(forFruits("banana"), withOffers);

        assertEquals(60, result);
    }

    private List<String> forFruits(String... fruits) {
        return Arrays.asList(fruits);
    }

    @Test
    public void fruits() {
        String apple = "apple";
        String pear = "pear";

        Map<String, Entry<Integer, Integer>> ll = new HashMap<>();
        ll.put("apple", new SimpleEntry<>(3, 130));
        ll.put("pear", new SimpleEntry<>(2, 45));

        // TODO: Do we sell lychee?
        int result = checkout.pay(
                forFruits(
                        apple, pear, apple,pear, "lychee", apple, "banana", "pineapple"), ll);

        assertEquals(455, result);
    }
}