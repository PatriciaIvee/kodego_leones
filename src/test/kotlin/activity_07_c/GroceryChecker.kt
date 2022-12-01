package activity_07_c

import activity_06_c.GroceryException

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SampleTestGrocery{
    var groceryChecker : Cart = Cart()

    @Test
    fun checkGroceryInput(){
        assertThrows<GroceryException.CartInputException.InputHasReachedLimit> {
            groceryChecker.checkGrocery("Banana",5555550.0, 600_000.0)
        }
        assertThrows<GroceryException.CartInputException.InputNoName> {
            groceryChecker.checkGrocery("",550.0, 550.0)
        }
        assertThrows<GroceryException.CartInputException.InputNoAmount> {
            groceryChecker.checkGrocery("Orange",0.0,0.0)
        }
    }


    @Test
    fun checkBuyerPayment(){
        assertThrows<GroceryException.BuyerException.PaymentNotEnough> {
            groceryChecker.checkPayment(800.00,900.00)
        }
        assertThrows<GroceryException.CartInputException.NegativeInput> {
            groceryChecker.checkPayment(-400.0, -400.0)
        }

    }

}