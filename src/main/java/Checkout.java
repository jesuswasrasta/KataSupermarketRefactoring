import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Checkout {
    public int pay(List<String> items, Map<String, Entry<Integer, Integer>> offers) {
        int grandTotal = 0;
        int apples = 0;
        int pears = 0;
        int pineapples = 0;
        int banana = 0;

        Map<String, Integer> priceList = new HashMap<>();
        priceList.put("apple", 50);
        priceList.put("pear", 30);
        priceList.put("pineapple", 220);
        priceList.put("banana", 60);

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
                    banana++;
                    break;
            }
        }

        for (Entry entry : offers.entrySet()) {
            switch (entry.getKey().toString()) {
                case "apple":
                    int a1 = (int) ((Entry) entry.getValue()).getKey();
                    if (apples >= a1) { grandTotal += (int) ((Entry) entry.getValue()).getValue(); }
                    apples -= a1;
                    break;
                case "pear":
                    int a2 = (int) ((Entry) entry.getValue()).getKey();
                    if (pears >= a2) { grandTotal += (int) ((Entry) entry.getValue()).getValue(); }
                    pears -= a2;
                    break;
                case "pineapple":
                    int a3 = (int) ((Entry) entry.getValue()).getKey();
                    if (pineapples >= a3) { grandTotal += (int) ((Entry) entry.getValue()).getValue(); }
                    pineapples -= a3;
                    break;
                case "banana":
                    int a4 = (int) ((Entry) entry.getValue()).getKey();
                    if (banana >= a4) { grandTotal += (int) ((Entry) entry.getValue()).getValue(); }
                    banana -= a4;
                    break;
            }
        }

        for (Entry entry : priceList.entrySet()) {
            switch (entry.getKey().toString()) {
                case "apple":
                    grandTotal += apples * (int) entry.getValue();
                    break;
                case "pear":
                    grandTotal += pears * (int) entry.getValue();
                    break;
                case "pineapple":
                    grandTotal += pineapples * (int) entry.getValue();
                    break;
                case "banana":
                    grandTotal += banana * (int) entry.getValue();
                    break;
            }
        }

        return grandTotal;
    }
}
