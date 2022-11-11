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

open class Cart {
    var customer: ArrayList<Customer> = ArrayList()
    var orderNumber: Set<Int> = mutableSetOf()
    var orders:Map<String,Int> = HashMap()
    var ordersPrice:Map<String,Double> = HashMap()

    class Customer{
        var lastName: String = ""
        var firstName: String = ""
        var mobileNumber: String = ""
        var address: String = ""
    }
}

enum class Status {
    PREPARING,
    FOR_PICKUP,
    FOR_DELIVERY,
    DELIVERED,
    CANCELLED,
    PAID,
    UNKNOWN
}

fun updateOrder(){

}