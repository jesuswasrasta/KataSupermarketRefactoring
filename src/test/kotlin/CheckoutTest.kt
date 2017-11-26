import org.junit.Assert.assertEquals
import org.junit.Test

class CheckoutTest {
    @Test
    fun apple() {
        //Arrange
        val il = ArrayList<String>()
        il.add("apple")
        val ll = HashMap<String, Map.Entry<Int, Int>>()
        val checkout = Checkout()

        //Act
        val result = checkout.pay(il, ll)

        //Assert
        assertEquals(50, result.toLong())
    }

    @Test
    fun fruits() {
        //Arrange
        val it = ArrayList<String>()
        it.add("apple")
        it.add("pear")
        it.add("apple")
        it.add("pear")
        it.add("lychee")
        it.add("apple")
        it.add("banana")


        val ll = HashMap<String, Map.Entry<Int, Int>>()
        ll.put("apple", SimpleEntry(3, 130))
        ll.put("pear", SimpleEntry(2, 45))


        val checkout = Checkout()

        //Act
        val result = checkout.pay(it, ll)

        //Assert
        assertEquals(235, result.toLong())
    }
}