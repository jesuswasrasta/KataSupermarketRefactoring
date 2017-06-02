import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Checkout {
    public int pay(List<String> items, Map<String, Pair<Integer, Integer>> offers) {
        int result = 0;
        int apples = 0;
        int pears = 0;
        int pineapples = 0;
        int bananas = 0;

        Map<String, Integer> listPrice = new HashMap<>();
        listPrice.put("apple", 50);
        listPrice.put("pear", 30);
        listPrice.put("pineapple", 220);
        listPrice.put("banana", 60);

        for (String item : items) {
            switch (item) {
                case "apple":
                    apples++;
                    break;
                case "pear":
                    pears++;
                    break;
                case "pineapple":
                    pineapples++;
                    break;
                case "banana":
                    bananas++;
                    break;
            }
        }

        for (Entry entry : offers.entrySet()) {
            switch (entry.getKey().toString()) {
                case "apple":
                    int a1 = (int) ((Pair) entry.getValue()).getKey();
                    if (apples >= a1) { result += (int) ((Pair) entry.getValue()).getValue(); }
                    apples -= a1;
                    break;
                case "pear":
                    int a2 = (int) ((Pair) entry.getValue()).getKey();
                    if (pears >= a2) { result += (int) ((Pair) entry.getValue()).getValue(); }
                    pears -= a2;
                    break;
                case "pineapple":
                    int a3 = (int) ((Pair) entry.getValue()).getKey();
                    if (pineapples >= a3) { result += (int) ((Pair) entry.getValue()).getValue(); }
                    pineapples -= a3;
                    break;
                case "banana":
                    int a4 = (int) ((Pair) entry.getValue()).getKey();
                    if (bananas >= a4) { result += (int) ((Pair) entry.getValue()).getValue(); }
                    bananas -= a4;
                    break;
            }
        }

        for (Entry entry : listPrice.entrySet()) {
            switch (entry.getKey().toString()) {
                case "apple":
                    result += apples * (int) entry.getValue();
                    break;
                case "pear":
                    result += pears * (int) entry.getValue();
                    break;
                case "pineapple":
                    result += pineapples * (int) entry.getValue();
                    break;
                case "banana":
                    result += bananas * (int) entry.getValue();
                    break;
            }
        }

        return result;
    }
}
