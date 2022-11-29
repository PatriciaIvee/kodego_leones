package activity_05_c_oop

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

private val logger = KotlinLogging.logger {  }

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
    val groceryCart:ArrayList<Cart> = ArrayList()
    val cart = Cart()
    var product:Product = Poultry("Whole Chicken",120.0)
    cart.addItems(product,0.632)
    groceryCart.add(cart)
    product = Fish("Pamapano",220.0)
    cart.addItems(product,5.0)
    cart.checkOutCart()
}
open class Product(var productName: String,
                   var productPrice: Double)

class Poultry(productName: String,productPrice: Double): Product(productName, productPrice){
    val weight: Float = 0.0F
}
class Fish(productName: String,productPrice: Double): Product(productName, productPrice){
    val weight: Float = 0.0F
}
class CannedGoods(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0

}
class Snacks(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0
}
class FrozenGoods(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
}
class Fruits(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
}
class Vegetables(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
}

class Condiments(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
}
class Furniture(productName: String,productPrice: Double): Product(productName, productPrice){
    var width: Float = 0.0F
    var length: Float = 0.0F
    var height: Float = 0.0F
    var material: String = ""
    var color: String = ""
}
class Appliances(productName: String,productPrice: Double): Product(productName, productPrice){
    var width: Float = 0.0F
    var length: Float = 0.0F
    var height: Float = 0.0F
    var finish: String = ""
    var color: String = ""
    var manufactureDate =Date()
    var batch: String = ""
}
class Clothes(productName: String,productPrice: Double): Product(productName, productPrice){
    var size: String = ""
    var width: Float = 0.0F
    var length: Float = 0.0F
    var material: String = ""
    var color: String = ""
}
class Pet(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0

}
class SanitaryAndCleaning(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var pieces:Int = 0
}
class PersonalCare(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0

}

class Beverages(productName: String,productPrice: Double): Product(productName, productPrice) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
}
class WinesAndSpirits(productName: String,productPrice: Double): Product(productName, productPrice) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch:String = ""
    var expirationDate= Date()
}
class ImportedGoods(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch:String = ""
    var expirationDate= Date()
    var pieces: Int = 0
}

class Stationary(productName: String,productPrice: Double): Product(productName, productPrice) {
    var weight: Float = 0.0F
    var batch:String = ""
    var material: String= ""
    var pieces: Int = 0
}

class BreadAndPastries(productName: String,productPrice: Double): Product(productName, productPrice) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch:String = ""
    var expirationDate= Date()
    var pieces: Int = 0
}


class Cart {
    var uniqueID:String = ""
    lateinit var customer:Customer
    var items:HashMap<Product,Double> = HashMap() // polymorphism
    var itemsTotal:HashMap<Product,Double> = HashMap()

    fun addItems(product: Product, quantity: Double){
//        items.put(product,quantity)

        items[product] = quantity
        var totalPriceOfProduct = product.productPrice * quantity
        itemsTotal[product] = totalPriceOfProduct
    }

    fun removeItems(product: Product, quantity: Double){
        items.remove(product,quantity)
    }

    fun checkOutCart(){

        items.forEach{(key, value) ->
            var price = key.productPrice * value
            logger.info {"Item: ${key.productName} -- Price:${key.productPrice}, Amount: $value, Total: $price" }
//            logger.info {"Total Price: ${price.sum()}" }
        }

        logger.info { "Total Price : ${itemsTotal.values.sum()}" }
    }

    data class Customer(var address: String,
                        var mobileNumber: String,
                        var firstName: String,
                        var lastName:String){
    }
}