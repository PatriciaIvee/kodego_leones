package activity_03_c


import mu.KotlinLogging

private val logger = KotlinLogging.logger{}

/**
 * Covered Topic(s) : Functions
 * Instructions :
 * 1. Create an ArrayList of grocery products with 20 entries.
 *
 * 2. Create a HashMap called Cart.
 * Hint:  Hashmap<String, Int>
 *
 * 2. Create a function "addToCart" that will accept a String and an Int,
 * then it will add the input in the Hashmap. If the Entry already exists,
 * create a new entry in the HashMap.
 * Hint : you may add a "_01", "_02"
 * Example Coke_01, Coke_02
 *
 * 3. Create a function "checkOut". This will compute how many items have been checked out.
 *
 * 4. Create a function "removefromCart"  that will accept a String
 * and remove the input from the Hashmap. If there are multiple entries,
 * remove all from the HashMap.
 */

fun main() {
    var groceryProducts =arrayListOf(
        "Apple",
        "Orange",
        "Strawberry",
        "Lemon",
        "Grapes",
        "Ham",
        "Cheese",
        "Wine",
        "Rice",
        "Sausage",
        "Flour",
        "Juice",
        "Milk",
        "Cabbage",
        "Dragon Fruit",
        "Oslo Paper",
        "Toothbrush",
        "Toothpaste",
        "Banana",
        "Gulaman")

    val cart:HashMap<String,Int> = HashMap()
    val cartArray:ArrayList<String> = ArrayList()

    addItemsToCart(cart,cartArray)

//    logger.info { "Add Item in Cart" }
//    logger.info { "First Add the Item then Add How Many you need." }
//    addToCart(cart,cartArray)
//    logger.info { "Add Item in Cart" }
//    logger.info { "First Add the Item then Add How Many you need." }
//    addToCart(cart,cartArray)
//    logger.info { "Add Item in Cart" }
//    logger.info { "First Add the Item then Add How Many you need." }
//    addToCart(cart,cartArray)

    removeItemsToCart(cart,cartArray)

//    logger.info { "Remove Item in Cart" }
//    removeFromCart(cart)

    logger.info { "Checking Out Items in Cart" }
    checkOut(cart)


}

    fun addItemsToCart(cart: HashMap<String, Int>, cartArray: ArrayList<String>) {
        var continueAdding = true
        while (continueAdding) {
            logger.info { "Add Item in Cart" }
            logger.info { "First Add the Item then Add How Many you need." }
            addToCart(cart, cartArray)
            logger.info { "Do you want to add more items? (Y/N)" }
            val answer = readLine().orEmpty().trim().toUpperCase()
            continueAdding = answer == "Y"
        }
    }

    fun addToCart(cartHashmap: HashMap<String,Int> = HashMap(),
                  array: ArrayList<String> = ArrayList(),
                  item: String = readln(),
                  amount: Int = readln().toInt()
                   ){

        val countArray = array.count{it == item}
        array.add(item)

        if (cartHashmap.containsKey(item)){
            cartHashmap[item + countArray] = amount
        } else{
            cartHashmap[item] = amount
        }

        logger.info("Item added to cart: $item, Amount: $amount")
    }

    fun checkOut(cartHashmap: HashMap<String, Int>){
        cartHashmap.forEach{ (key, value) -> logger.info {"Item:$key, amount: $value" }  }
        logger.info { "total Amount : ${cartHashmap.values.sum()}" }
    }

    fun removeFromCart (cartHashmap: HashMap<String, Int> = HashMap(),item: String = readln()){
        if (cartHashmap.containsKey(item)){
            cartHashmap.remove(item)
        }else{
            logger.info { "Item Doesn't Exist In the List." }
        }

    }

    fun removeItemsToCart(cart: HashMap<String, Int>, cartArray: ArrayList<String>) {
        var continueRemoving = true
        while (continueRemoving) {
            logger.info { "Remove Item in Cart" }
            logger.info { "First Add the Item then Add How Many you need." }
            addToCart(cart, cartArray)
            logger.info { "Do you want to remove more items? (Y/N)" }
            val answer = readLine().orEmpty().trim().toUpperCase()
            continueRemoving = answer == "Y"
        }
    }