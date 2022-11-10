package activity_01_j

import mu.KotlinLogging

private val logger = KotlinLogging.logger {  }
fun main() {
    /**
     * Using Activity 01 - C
     * Implement a process where items are added to the grocery cart.
     * User : Cashier
     * Goal: List of Items bought, how many items were bought and total cost.
     * Scope: Data Structures
     */
    /*
    1. Cashier needs to log in the program / system.
    2. Cashier needs to type what are the items bought and the number of the
    item bought (how many)
    3. the items will accumulate until the cashier lists all the items bought
    4. the Items prices will add up and the costs will be below the list
    hence the total amount of the grocery items.
    5. User can log out of the program/system once he is done.
     */
//

//    Log in process
    val logInGroceryCart : Map<String, String> = mutableMapOf(("Cashier" to "12345"),("guest" to "12345")) // username(K) and password (V)
    if (logInGroceryCart.equals("Cashier" to "12345")){
        logger.info{"Welcome${logInGroceryCart["Cashier"]}"}
        var groceryCart = mutableMapOf<String, Int>() // the item (K) and number of items(V)
    }

//Cart List

    val prices = ArrayList<Double>()
    var totalPrice = prices.sum()
}