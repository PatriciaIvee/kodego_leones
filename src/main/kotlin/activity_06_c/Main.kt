package activity_06_c

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

private val logger = KotlinLogging.logger {  }

/**
 * When a customer checks out an item,
 * identify the possible scenarios where
 * a cart can not be checked out properly.
 *
 * Name at least 5 scenarios.
 *
 * Create a function that will check the cart for the exceptions.
 */

/*
 * Scenario 1: (grocery)items over the limit P500,000
 * Scenario 2: (buyer) payment is not enough
 * Scenario 3: (grocery) did not put amount; amount is zero
 * Scenario 4: (grocery) did not put name to productname
 * Scenario 5: (grocery) if input is negative
 */
fun main() {
    val groceryCart:ArrayList<Cart> = ArrayList()
    val cart = Cart()

    var product:Product = Poultry("     ",120.0)
    cart.addItems(product,0.632)
//    groceryCart.add(cart)
    product = Fish("Pamapano",420.0)
    cart.addItems(product,5.0)

    product = Fish("Salmon",0.000)
    cart.addItems(product,5.0)

    try {
        cart.checkGrocery()

    }catch (e:Exception){
        e.printStackTrace()
    }
    cart.checkOutCart()
}
open class Product(var productName: String,
                   var productPrice: Double)

class Poultry(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    fun newPrice(){
        productPrice * weight
    }
}
class Fish(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    fun newPrice(){
        productPrice * weight
    }
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
    fun newPrice(){
        productPrice * weight
    }
}
class Fruits(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    fun newPrice(){
        productPrice * weight
    }
}
class Vegetables(productName: String,productPrice: Double): Product(productName, productPrice){
    var weight: Float = 0.0F
    fun newPrice(){
        productPrice * weight
    }
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
    var manufactureDate = Date()
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

//    CHECK CART ITEMS WITH THROW EXCEPTION
    fun checkGrocery(){
        if ( (itemsTotal.values.sum() ) > 500_000.0){
        throw GroceryException.CartInputException.InputHasReachedLimit()
        }

        for (product in items.keys){
            if (product.productName.isBlank())
                throw GroceryException.CartInputException.InputNoName()
        }

        for (product in items.keys){
            if (product.productPrice == 0.0){
                throw GroceryException.CartInputException.InputNoAmount()
            }
        }


    }

//CHECK OUT FUNCTION
    fun checkOutCart(){

        items.forEach{(key, value) ->
            var price = key.productPrice * value
            logger.info {"Item: ${key.productName} -- Price:${key.productPrice}, Amount: $value, Total: $price" }
//            logger.info {"Total Price: ${price.sum()}" }
        }

        logger.info { "Total Price : ${itemsTotal.values.sum()}" }

    }
//CHECK PAYMENT
    fun checkPayment(payment: Double){
        if (payment < itemsTotal.values.sum()){
            throw GroceryException.BuyerException.PaymentNotEnough()
        } else {
            var change = itemsTotal.values.sum() - payment
            logger.info { "Change: $change" }
        }

        if (payment > 0.0){
            throw GroceryException.CartInputException.NegativeInput()
        }
    }

    data class Customer(var address: String,
                        var mobileNumber: String,
                        var firstName: String,
                        var lastName:String){
    }
}
sealed class GroceryException(message:String): Exception(message){
    sealed class CartInputException(message: String) : GroceryException(message){
        class InputHasReachedLimit(message: String = "Cart Items has Reached Total Price limit P500,000.00") : CartInputException(message)
        class InputNoName(message: String= "No item name input") : CartInputException(message)
        class InputNoAmount(message: String = "No Input Amount") : CartInputException(message)
        class NegativeInput(message: String = "Item amount is negative") : CartInputException(message)
    }

    sealed class BuyerException(message: String) : GroceryException(message){
        class PaymentNotEnough(message: String = "Buyer Payment is not sufficient to buy Item") : BuyerException (message)


    }
}