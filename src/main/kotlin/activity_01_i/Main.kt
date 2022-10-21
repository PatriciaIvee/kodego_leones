package activity_01_i

import java.util.Date

fun main() {

    /**
     * Using Activity 01 - B, Implement a process where someone can borrow a book.
     * User: Librarian
     * Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
     * Scope : Data Structures
     */

    var userNameHashSet:Set<String> = HashSet<String>()
    var logInDetail:Map<String, String> = mutableMapOf()
    var bookNames:List<String> = mutableListOf<String>()
    var isbnNumberList = ArrayList<String>()
    var bookLocationMap:Map<String, Int> = mutableMapOf() //Section and bookshelf number
    var timeBorrowedArrayList = ArrayList<Date>()
    var timeReturnedArrayList = ArrayList<Date>()


}