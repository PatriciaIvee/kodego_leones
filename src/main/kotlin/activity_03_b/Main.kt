package activity_03_b

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
/**
 * Covered Topic(s) : Functions
 * Instructions :
 * 1. Create an ArrayList of book name with 20 entries.
 * 2. Create a function "isBookInRecord" that will accept a String
 * and return true if the book is found, otherwise false.
 * 3. Create a function "addBook" that will accept a String and add it to the ArrayList.
 * 4. Create a function "removeBook"  that will accept a name and remove it from the
 * ArrayList if it exactly matches the book name.
 * 5. Create a function "countBooks" that will return the size of the ArrayList.
 * 6. Create a function "searchBookWildSearch" that will accept a String and search if
 * that string is found with in the ArrayList,
 * it will return an ArrayList of books that matched if there are.
 * 7. Create a function  "searchBookName" that will accept a String and search if
 * there is an exact match of the String input,
 * it will return an ArrayList of books that matched if there are.
 * 8.  Create a function "showBooks" that will print all the entries in the ArrayList.
 */
fun main() {
    val bookNames:ArrayList<String> = ArrayList()
    bookNames.add("Book1")
    bookNames.add("Book2")
    bookNames.add("Harry potter 2: Chamber of Secrets")
    bookNames.add("Harry potter 3 : prisoner of Azkaban ")
    bookNames.add("Book5")
    bookNames.add("Book6")
    bookNames.add("Book7")
    bookNames.add("Book8")
    bookNames.add("Book9")
    bookNames.add("Book10")
    bookNames.add("Book11")
    bookNames.add("Book12")
    bookNames.add("Book13")
    bookNames.add("Book14")
    bookNames.add("Book15")
    bookNames.add("Book16")
    bookNames.add("Book17")
    bookNames.add("Book18")
    bookNames.add("Book19")
    bookNames.add("Book20")

    logger.info { "Check if book is in the record: " }
    isBookInRecord(bookArrayList = bookNames)

    logger.info { "Add a book: " }
    addBook(bookArrayList = bookNames)

    logger.info { "Remove a book: " }
    removeBook(bookArrayList = bookNames)

    logger.info { "Number of books: " }
    countBooks()

    logger.info { "BookWildSearch:" }
    searchBookWildSearch(bookArrayList = bookNames)

    logger.info { "Search exact book name: " }
    searchBookName(bookArrayList = bookNames)

    logger.info { "Books to show:" }
    showBooks(bookArrayList = bookNames)

}

//isBookInRecord
fun isBookInRecord(bookName:String = readln(),bookArrayList: ArrayList<String> = ArrayList()):Boolean{
    val search = bookArrayList.filter {
        it.contains(bookName, ignoreCase = true)
    }
    logger.info { "Is book in record:" }
    return if (search.isNotEmpty()){
        logger.info{ true }
        true
    } else {
        logger.info { false }
        false
    }
}

//addBook
fun addBook(bookName:String = readln(),bookArrayList: ArrayList<String> = ArrayList()){
    bookArrayList.add(bookName)
}
//removeBook
fun removeBook(bookName:String = readln(),bookArrayList: ArrayList<String> = ArrayList()){
    if (bookArrayList.contains(bookName)){
        bookArrayList.remove(bookName)
        logger.info { "$bookName removed from the list." }
    }else {
        logger.info { "$bookName cannot be removed because [a] it either doesn't exist in the list" +
                " or [b]book name isn't exact match." }
    }

}
//countBooks
fun countBooks(bookArrayList: ArrayList<String> = ArrayList()){
    logger.info{"Number of books in the list: ${ bookArrayList.size }"}
}
//searchBookWildSearch
fun searchBookWildSearch(bookName:String = readln(),bookArrayList: ArrayList<String> = ArrayList()){

    val wildSearch = bookArrayList.filter {
        it.contains(bookName, ignoreCase = true)
    }
    wildSearch.forEach { bookNames -> println(bookNames) }
}
//searchBookName
fun searchBookName(bookName:String = readln(),bookArrayList: ArrayList<String> = ArrayList()){
    val exactSearch = bookArrayList.filter { it == bookName }
    if (exactSearch.isNotEmpty()){
        exactSearch.forEach { bookNames -> println(bookNames) }
    }else {
        logger.info { "no exact match for $bookName" }
    }
}
//showBooks
fun showBooks(bookArrayList: ArrayList<String> = ArrayList()){
    bookArrayList.forEach { bookNames -> println(bookNames) }
}