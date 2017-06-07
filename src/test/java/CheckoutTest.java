import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {
    @Test
    void apple() {
        //Arrange
        List<String> il = new ArrayList<>();
        il.add("apple");
        Map<String, Pair<Integer, Integer>> ll = new HashMap<>();
        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(il, ll);

        //Assert
        assertEquals(50, result);
    }

    @Test
    void fruits() {
        //Arrange
        List<String> it = new ArrayList<>();
        it.add("apple");
        it.add("pear");
        it.add("apple");
        it.add("pear");
        it.add("apple");
        it.add("banana");
        it.add("bear");

        Map<String, Pair<Integer, Integer>> ll = new HashMap<>();
        ll.put("apple", new Pair<>(3, 130));
        ll.put("pear", new Pair<>(2, 45));

        Checkout checkout = new Checkout();

        //Act
        int result = checkout.pay(it, ll);

        //Assert
        assertEquals(235, result);
    }
}