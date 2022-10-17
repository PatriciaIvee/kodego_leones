package activity_01_c


import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {

    /**
     * You are tasked to automate an inventory system for a grocery.
     * Identify the items that can be bought in a grocery store.
     * After listing the different items, identify the characteristics of the items.
     * You are also tasked to group the items in categories to help manage the grocery.
     * Use the proper data types.
     */

    var dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")
//    Grocery Items Category
    var spices : String
    var herb : String
    var seeds : String
    var seasoning : String
    var vinegar : String
    var soySauce : String
    var oysterSauce : String
    var cookingOil : String
    var salt : String
    var sugar : String
    var fruits : String
    var vegetables : String
    var pork : String
    var beef : String
    var exoticFood : String
    var processedMeat: String
    var cereal : String
    var grains : String
    var babyNeeds : String
    var coffee : String
    var candy : String
    var chocolate : String
    var candles : String
    var scentedCandles : String
    var incense : String
    var battery : String
    var cookingEquipment : String
    var detergent : String
    var poultry : String
    var seafood : String
    var condiments : String
    var snacks : String
    var nuts : String
    var bakingNeeds : String
    var cannedGoods : String
    var breadAndPastries : String
    var philippineGoods : String
    var liquor : String
    var winesAndSpirits : String
    var drinksAndJuice : String
    var dairy : String
    var noodlesAndPasta : String
    var foreignFood : String
    var readyToCookFood : String
    var oralCare : String
    var partyMaterials : String
    var petFoods : String
    var petAccessories : String
    var cleaningSolutions : String
    var cleaningEquipment : String
    var beautyProducts : String
    var makeUp : String
    var fragrances : String
    var deodorants : String
    var hygiene : String
    var feminineHygiene : String
    var firstAid : String
    var rag : String
    var basket : String
    var waterBottle : String
    var christmasNocheBuena : String
    var spread : String

// something to do with the receipt
    var totalAmount : Double
    var groceryItems : String
    var groceryItemsTotal : Int?
    var discountPercent : Double
    var promoAvailable : Boolean

//    Inventory
    var batchNumber : String
    var stockNumber: Int
    var outOfStock : Boolean
    var stockWarning  =  1 ..10
    var damagedItem : Int
    var missingStock : Int?
    var expired : Boolean?
    var dateDelivered : Date
    var expirationDate : Date?
    var officerInCharge : String
    var stockChecker : String
    var dateUpdatedStock : Date

// login details
    var userName : String
    var email : String
    var password : String
}