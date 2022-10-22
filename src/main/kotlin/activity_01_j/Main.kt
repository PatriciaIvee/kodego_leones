package activity_01_j

fun main() {
    /**
     * Using Activity 01 - C
     * Implement a process where items are added to the grocery cart.
     * User : Cashier
     * Goal: List of Items bought, how many items were bought and total cost.
     * Scope: Data Structures
     */
    /*
    First Cashier needs to log in the program / system.
    Second Cashier needs to type what are the items bought and the number of the
    item bought (how many)
    Third the items will accumulate until the cashier lists all the items bought
    Forth the Items bought prices will add up and the costs will be below the list
    hence the total amount of the grocery items.
    User can log out of the program/system once he is done.
     */

//    Log in process
    var logInGroceryCart : Map<String, String> = mutableMapOf() // username(K) and password (V)

//Cart List
    var groceryCart : Map <String, Int> = mutableMapOf() // the item (K) and number of items(V)
    var prices = ArrayList<Double>()
    var totalPrice = prices.sum()
}