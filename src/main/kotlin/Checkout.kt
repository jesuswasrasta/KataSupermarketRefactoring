import kotlin.collections.Map.Entry

class Checkout {
    fun pay(items: List<String>, offers: Map<String, Entry<Int, Int>>): Int {
        var res = 0
        var a = 0
        var p = 0
        var ananas = 0
        var b = 0

        val map = HashMap<String, Int>()
        map.put("apple", 50)
        map.put("pear", 30)
        map.put("pineapple", 20)
        map.put("banana", 60)

        for (item in items) {
            when (item) {
                "apple" -> a++
                "pear" -> p++
                "pineapple" -> ananas++
                "banana" -> b++
            }
        }

        //Here I have to cycle through every offer to see if it applies
        for ((key, value) in offers) {
            when (key.toString()) {
                "apple" -> {
                    val a1 = (value as Entry<*, *>).key as Int
                    if (a >= a1) {
                        res += (value as Entry<*, *>).value as Int
                    }
                    a -= a1
                }
            //jb 2008-09-12: don't sell lychee anymore, but maybe in the future...
            //                case "lychee":
            //                    int a2 = (int) ((Entry) entry.getValue()).getKey();
            //                    if (p >= a2) { res += (int) ((Entry) entry.getValue()).getValue(); }
            //                    p -= a2;
            //                    break;
                "pear" -> {
                    val a2 = (value as Entry<*, *>).key as Int
                    if (p >= a2) {
                        res += (value as Entry<*, *>).value as Int
                    }
                    p -= a2
                }
                "pineapple" -> {
                    val a3 = (value as Entry<*, *>).key as Int
                    if (ananas >= a3) {
                        res += (value as Entry<*, *>).value as Int
                    }
                    ananas -= a3
                }
                "banana" -> {
                    val a4 = (value as Entry<*, *>).key as Int
                    if (b >= a4) {
                        res += (value as Entry<*, *>).value as Int
                    }
                    b -= a4
                }
            }
        }

        for ((key, value) in map) {
            when (key.toString()) {
                "apple" -> res += a * value
                "pear" -> res += p * value
                "pineapple" -> res += ananas * value
                "banana" -> res += b * value
            }
        }

        return res
    }
}

class SimpleEntry(override val key: Int, override val value: Int) : Entry<Int, Int>
