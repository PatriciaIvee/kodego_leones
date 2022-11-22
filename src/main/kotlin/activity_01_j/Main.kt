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
//Log in HashMap (Username and Password)
    val logInInfo = HashMap<String, String>()
    logInInfo["Cashier"] = "0000"
    logInInfo["Guest"] = "0000"


//    Log in process

    logger.info { "Please Enter your Username" }
    var userName = readln()
    logger.info { "Please enter password:" }
    var password = readln()
    while (userName !in logInInfo){
        while (userName !in logInInfo || password != logInInfo.getValue(userName)){
            logger.info { "Not correct username and password" }
            logger.info { "Enter Username" }
            userName = readln()
            logger.info { "Enter password" }
            password = readln()
            if (userName !in logInInfo || password != logInInfo.getValue(userName)){
                logger.info { "Incorrect password for $userName" }
                logger.info { "Enter password" }
                password = readln()
            }
        }

    }
//    welcome the user
    logger.info { "Welcome $userName!" }

//Grocery Price HashMap

    val prices = HashMap<String,Double>()
    prices["Apple"] = 20.00
    prices["Gardenia Clsc White Bread Reg "] = 85.50
    prices["Coco Mama Fresh Gata 200ML"] = 30.75
    prices["Maling Chicken L/Meat 397 G"] = 115.95
    prices["Iodized Salt 1KG"] = 29.00
    prices["Isopropyl Alcohol 500 ML"] = 90.35
    prices["Baby Dobe Hair to Toe Baby Wash Sensitive Moisture 400ML"] = 334.95
    prices["J&J Johnson's Milk Rice Baby Bath Refill 200ML"] = 75.19
    prices["Bear Brand Junior 1+ Plain 2.4KG"] =1119.10
    prices["Cerelac Infant Cereals Rice and Soya 250G"] = 143.15
    prices["ISOMIL Two for Kids 1-3 Years Old Plain 850G"] = 1175.65
    prices["Nestle Chuckie My Chocolate Buddy 110ML"] = 14.55
    prices["Ricoa Rich Chocolate 1KG"] = 499.95
    prices["Ovaltine Ready Mixed Malt Chocolate 260G"] = 75.75

//    HashMap Cart
    val groceryCart = HashMap<String, Double>()
    val groceryCartAdd = HashMap<String, Int>()


    var input = ""
    var inputAddToCart = ""

    while (input != "n") {
        logger.info { "Add to Cart Item" }
         inputAddToCart = readln()
        logger.info { "Add Amount to Item" }
        val inputAmountAddToCart = readln().toInt()

        if (inputAddToCart in prices){

            if (inputAddToCart in groceryCartAdd){
                if (groceryCartAdd.containsKey(inputAddToCart)){
                    val newAmount = groceryCartAdd.getValue(inputAddToCart) + inputAmountAddToCart
                    groceryCartAdd[inputAddToCart] = newAmount
                    logger.info { "$inputAddToCart already in add to cart list" }

                }
            } else {
                groceryCartAdd[inputAddToCart] = inputAmountAddToCart
            }

            groceryCart[inputAddToCart] = prices.getValue(inputAddToCart) * groceryCartAdd.getValue(inputAddToCart)
            logger.info { "$inputAddToCart Price:${prices.getValue(inputAddToCart)} Amount:${groceryCartAdd.getValue(inputAddToCart)} Total: ${prices.getValue(inputAddToCart) * groceryCartAdd.getValue(inputAddToCart)}" }

        }else{
            logger.info { "item not in prices" }
        }
        logger.info { "Enter another item? y/n" }
        input = readln()
        while (input != "y" && input != "n") {
            logger.info { "please enter y or n" }
            input = readln()
        }

    }

    for(entry in groceryCart){
//        logger.info { groceryCart.entries }
        logger.info { "${entry.key}, Amount: ${groceryCartAdd.getValue(inputAddToCart)} Total: ${entry.value}" }
    }
    val totalPrice = groceryCart.values.sum()
    logger.info { "Total: $totalPrice" }
}