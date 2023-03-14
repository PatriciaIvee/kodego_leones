package activity_01_b

import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {
    /**
     * You are tasked to automate a school’s library.
     * Identify the items that can be borrowed in a Library.
     * After listing the different items, identify the characteristics of the items.
     * Use the proper data types.
     */

//    DateFormatter
    var dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy")
//    School Library Directory label
    val schoolLibraryDirectory : String

//    Status if item is borrowed or available
    var borrowed : Boolean = false
    var available : Boolean = false
    var dateBorrowed: Date //DateTime
    var returnDate : Date
    var returned : Boolean = false
    var lost : Boolean = false

//    Information about book or ebook
    var eBookTitle : String
    var bookTitle : String
    var author : String
    var bookId : String
    var isbnBookNumber : Long
    var eIsbnBookNumber : Long
    var publisher : String?
    var publishedDate : Date?
    var edition : String?
    var numberOfPages : Int?
    var numberOfCopies : Int?
    var shelfNumber : Int
    var copyright : String
    var subject : String?
    var classification : String
    var language : String
    var eBookFileSize : Int
    var totalBorrowedBooks: Int?
    var borrowHistory : Date

//  Information about items borrowed in a library that are not books
    var musicResource : String
    var itemIdNumber : String
    var electronicEquipmentResource : String
    var newsArticleResource : String
    var mapResource : String
    var visualMaterialResource : String
    var type : String
    var itemTotal: Int
    var burrowLimit : Int

//    Sorting Information
    var resourceType : String
    var alphabeticalOrder : String
    var ascendingOrder : Boolean
    var descendingOrder : Boolean

//    log in details for School Library Directory
    var userName : String
    var email : String
    var password : String
    var libraryCard : String

//   Contact details
    var lastName : String
    var firstName : String
    var middleInitial : Char
    var suffix : String?
    var phoneNumber : Long
    var address : String
    var landlineNumber : Int

}