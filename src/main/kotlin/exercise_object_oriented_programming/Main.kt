package exercise_object_oriented_programming

/**
 * You are tasked to create an application for a fast food company.
 * The application will do the following :
 * 1. Take orders of the customers
 * - Create a cart that will contain the items bought by a customer
 * - Each cart has a unique id
 * - Each card belongs to a customer
 * - a customer has an address mobile number  first name and last name.
 * 2. Show the status of the orders if they are sent to the kitchen,
 * being prepared, for pickup, for delivery, delivered, cancelled, paid, unknown.
 * - Use enumeration
 * - Create a function "Update order" which will update the cart of a specific customer
 * 3. Show the items being sold. The fast food company sells fresh fruits, shakes, juices,
 * sandwiches, and salads.
 * - Create 5 items for each category of items being sold.
 * - Use OOP concepts to create the classes for the food category.
 * - You must use Inheritance, Polymorphism, Encapsulation, Abstraction
 */
//need to implement polymorphism
//abstraction is get and set

fun main() {

    var fruits = ArrayList<Fruits>()
    fruits.add(Fruits("Banana", 13.00))
    fruits.add(Fruits("Mango",23.00))
    fruits.add(Fruits("Orange",13.00))
    fruits.add(Fruits("Watermelon",22.00))
    fruits.add(Fruits("Strawberry", 14.00))

    var shake = ArrayList<Shake>()
    shake.add(Shake("Watermelon Shake", 55.00))
    shake.add(Shake("Mango Graham Shake", 65.00))
    shake.add(Shake("Orange Smoothie", 45.00))
    shake.add(Shake("Banana Milkshake", 45.00))
    shake.add(Shake("Strawberry Milkshake", 65.00))

    var juices = ArrayList<Juices>()

    juices.add(Juices("Orange Juice", 34.00))
    juices.add(Juices("Pineapple Juice", 44.00))
    


}
open class Product {
     var name:String = ""
        private set //var name is hidden
     var price: Double = 0.0

    constructor(name: String, price: Double){
        this.name = name
        this.price = price
    }

}

class Fruits(name : String, price: Double):Product(name, price) {
    var quantity: Float = 0.0F
    var quantityUnits: String = "per Piece"

}
class Shake(name : String, price: Double):Product(name, price) {
    var size: Any  = ""
    var ingredients : ArrayList<String> = ArrayList()
    var addons : ArrayList<Any> = ArrayList()

}

class Juices(name : String, price: Double):Product(name, price) {
    var size: Any  = ""
    var ingredients : ArrayList<String> = ArrayList()
}

 class Sandwiches(name : String, price: Double):Product(name, price) {

    var ingredients : ArrayList<String> = ArrayList()
    var addons : ArrayList<Any> = ArrayList()
    var breadType: Any = ""
}

class Salad(name : String, price: Double):Product(name, price) {
    var size: Any  = ""
    var ingredients : ArrayList<String> = ArrayList()
    var dressing: Any = ""
    var addons : ArrayList<Any> = ArrayList()
}


class Cart {
    var uniqueID:String = ""
    lateinit var customer:Customer
    var items:HashMap<Product,Float> = HashMap() // polymorphism
    var status:OrderStatus = OrderStatus.UNKNOWN

    fun updateOrder(status: OrderStatus){
        this.status = status
    }

    fun addItems(product: Product, quantity: Float){
//        items.put(product,quantity)
        items[product] = quantity
    }

    data class Customer(var address: String,
                        var mobileNumber: String,
                        var firstName: String,
                        var lastName:String){
    }
}

enum class OrderStatus {
    SENT_TO_KITCHEN,
    BEING_PREPARED,
    FOR_PICKUP,
    FOR_DELIVERY,
    DELIVERED,
    PICKED_UP,
    CANCELLED,
    UNKNOWN
}