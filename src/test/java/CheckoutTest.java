import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {
    @Test
    void _1Apple_Costs_50cents() {
        //Arrange
        List<String> items = new ArrayList<>();
        items.add("apple");
        Map<String, Pair<Integer, Integer>> listPrice = new HashMap<>();
        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(items, listPrice);

        //Assert
        assertEquals(50, result);
    }

    @Test
    void _3Apples2Pears1Pineapple1Banana_Costs_455cents() {
        //Arrange
        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("pear");
        items.add("apple");
        items.add("pear");
        items.add("apple");
        items.add("pineapple");
        items.add("banana");

        Map<String, Pair<Integer, Integer>> listPrice = new HashMap<>();
        listPrice.put("apple", new Pair<>(3, 130));
        listPrice.put("pear", new Pair<>(2, 45));

        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(items, listPrice);

        //Assert
        assertEquals(455, result);
    }
}