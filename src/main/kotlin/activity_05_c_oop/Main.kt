package activity_05_c_oop

/**
 * Covered Topic(s) : OOP
 * 1. Create a parent class for all the products in the grocery.
 * 2. Create a cart to store the groceries.
 * 3. Create a Main class where you will add the Cart.
 * 4. In the main class add the following functions
 * a - add to cart > add an item in the cart
 * b - remove from cart > remove item in the cart
 * c - check out cart > compute the total cost of the cart.
 */

fun main() {

}
open class Product(var productName: String,
                   var productPrice: Double)

class Poultry(productName: String,productPrice: Double): Product(productName, productPrice){}
class Fish(productName: String,productPrice: Double): Product(productName, productPrice){}
class CannedGoods(productName: String,productPrice: Double): Product(productName, productPrice){}
class Snacks(productName: String,productPrice: Double): Product(productName, productPrice){}
class FrozenGoods(productName: String,productPrice: Double): Product(productName, productPrice){}
class Fruits(productName: String,productPrice: Double): Product(productName, productPrice){}
class Vegetables(productName: String,productPrice: Double): Product(productName, productPrice){}
class Condiments(productName: String,productPrice: Double): Product(productName, productPrice){}
class Furniture(productName: String,productPrice: Double): Product(productName, productPrice){}
class Appliances(productName: String,productPrice: Double): Product(productName, productPrice){}
class Clothes(productName: String,productPrice: Double): Product(productName, productPrice){}
class Pet(productName: String,productPrice: Double): Product(productName, productPrice){}
class SanitaryAndCleaning(productName: String,productPrice: Double): Product(productName, productPrice){}
class PersonalCare(productName: String,productPrice: Double): Product(productName, productPrice){}

class Cart(cart:HashMap<String,Double>){}

fun addToCart(){

}

fun removeToCart(){

}

fun checkOutCart(){

}