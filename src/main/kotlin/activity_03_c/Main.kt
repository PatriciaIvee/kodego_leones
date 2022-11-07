package activity_03_c

import java.io.LineNumberReader

/**
 * Covered Topic(s) : Functions
 * Instructions :
 * 1. Create an ArrayList of grocery products with 20 entries.
 * 2. Create a HashMap called Cart.
 * Hint:  Hashmap<String, Int>
 * 2. Create a function "addToCart" that will accept a String and an Int,
 * the it will add the input in the Hashmap. If the Entry already exists,
 * create a new entry in the HashMap.
 * 3. Create a function "checkOut". This will compute how many items have been checked out.
 * 4. Create a function "removefromCart"  that will accept a String
 * and remove the input from the Hashmap. If there are multiple entries,
 * remove all from the HashMap.
 */

fun main() {
    var groceryProducts =arrayListOf<String>(
        "item1",
        "item2",
        "item3",
        "item4",
        "item5",
        "item6",
        "item7",
        "item8",
        "item9",
        "item10",
        "item11",
        "item12",
        "item13",
        "item14",
        "item15",
        "item16",
        "item17",
        "item18",
        "item19",
        "item20")

    var cart:Map<String,Int> = HashMap()
}

fun addToCart(cart:Map<String,Int> = HashMap()){

}