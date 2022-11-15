package activity_04_c

import java.util.*

/**
 *Covered Topic(s) : Classes
 * Create class for
 * Poultry
 * Fish
 * Canned goods
 * Snacks
 * Frozen Products
 * Fruits
 * Vegetables
 * Condiments
 * Furniture
 * Appliances
 * Clothes
 * Pet
 * Sanitary Products
 * Personal Care
 * Add 5 more type of items you can find in the grocery.
 * Identify the attributes for all the classes mentioned.
 */

class Poultry(name: String, price: Double) {
    val weight: Float = 0.0F
}

class Fish(name: String, price: Double) {
    var weight: Float = 0.0F
}
class CannedGoods(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0
}
class Snacks(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0
}

class FrozenProducts(name: String, price: Double) {
    var weight: Float = 0.0F
}

class Fruits(name: String, price: Double) {
    var weight: Float = 0.0F
}
class Vegetables(name: String, price: Double) {
    var weight: Float = 0.0F
}

class Condiments(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
}

class Furniture(name: String, price: Double){
    var width: Float = 0.0F
    var length: Float = 0.0F
    var height: Float = 0.0F
    var material: String = ""
    var color: String = ""
}

class Appliances(name: String, price: Double){
    var width: Float = 0.0F
    var length: Float = 0.0F
    var height: Float = 0.0F
    var finish: String = ""
    var color: String = ""
    var manufactureDate =Date()
    var batch: String = ""

}
class Clothes(name: String, price: Double){
    var size: String = ""
    var width: Float = 0.0F
    var length: Float = 0.0F
    var material: String = ""
    var color: String = ""
}

class Pet(name: String, price: Double){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0

}

class SanitaryProducts(name: String, price: Double){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var pieces:Int = 0
}

class PersonalCare(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
    var pieces:Int = 0

}

//Five Additional type of items I find in grocery store
class Beverages(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch: String = ""
    var expirationDate = Date()
}
class WinesAndSpirits(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch:String = ""
    var expirationDate= Date()
}
class ImportedGoods(name: String, price: Double){
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch:String = ""
    var expirationDate= Date()
    var pieces: Int = 0
}

class Stationary(name: String, price: Double) {
    var weight: Float = 0.0F
    var batch:String = ""
    var material: String= ""
    var pieces: Int = 0
}

class BreadAndPastries(name: String, price: Double) {
    var weight: Float = 0.0F
    var manufactureDate = Date()
    var batch:String = ""
    var expirationDate= Date()
    var pieces: Int = 0
}



