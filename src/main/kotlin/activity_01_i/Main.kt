package activity_01_i

import java.util.Date

fun main() {

    /**
     * Using Activity 01 - B, Implement a process where someone can borrow a book.
     * User: Librarian
     * Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
     * Scope : Data Structures
     */

//   Login, password username and details
    var userNameHashSet:Set<String> = HashSet<String>()
    var passwordArrayList = ArrayList<String>()
    var logInDetail:Map<String, String> = mutableMapOf() //Name and Library Card

//    Contact details
    var lastNameArrayList = ArrayList<String>()
    var firstNameArrayList = ArrayList<String>()
    var middleInitialArrayList =ArrayList<Char>()
    var suffixArrayList =  ArrayList<String?>()
    var phoneNumberArrayList = ArrayList<Long>()
    var addressArrayList = ArrayList<String>()
    var landlineNumberArrayList =ArrayList<Int?>()

//    Book information location and time borrowed
    var eBookTitlesArrayList = ArrayList<String>()
    var bookTitlesArrayList = ArrayList<String>()
    var authorsArrayList = ArrayList<String>()
    var bookIdsArrayList = ArrayList<String>()
    var isbnBookNumberArrayList = ArrayList<String>()
    var eIsbnBookNumberArrayList = ArrayList<String>()
    var publisherArrayList = ArrayList<String?>()
    var publishedDateArrayList = ArrayList<Date>()
    var editionArrayList = ArrayList<String?>()
    var numberOfPagesArrayList = ArrayList<Int?>()
    var numberOfCopiesArrayList = ArrayList<Int?>()
    var shelfNumberArrayList = ArrayList<Int?>()
    var copyrightArrayList = ArrayList<String>()
    var subjectArrayList = ArrayList<String?>()
    var classificationArrayList = ArrayList<String>()
    var languagesArrayList = ArrayList<String>()
    var eBookFileSizeArrayList = ArrayList<Int?>()
    var totalBorrowedBooks = ArrayList<Int?>()

    var bookLocationMap:Map<String, Int> = mutableMapOf() //Section and bookshelf number
    var timeBorrowedArrayList = ArrayList<Date>()
    var timeReturnedArrayList = ArrayList<Date>()
    var bookBorrowerArrayList = ArrayList<String>()
    var dayLimitBorrowSet:Set<CharRange> = mutableSetOf<CharRange>()

//  Information about items borrowed in a library that are not books
    var musicResourcesArrayList = ArrayList<String>()
    var itemIdNumberArrayList = ArrayList<String>()
    var electronicEquipmentResourcesArrayList = ArrayList<String>()
    var newsArticleResourcesArrayList = ArrayList<String>()
    var mapResourcesArrayList = ArrayList<String>()
    var visualMaterialResourceArrayList = ArrayList<String>()
    var typeArrayList = ArrayList<String>()
    var itemsTotalArrayList = ArrayList<Int>()


}