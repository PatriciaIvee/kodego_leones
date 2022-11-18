package activity_01_i

import mu.KotlinLogging
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


private val logger = KotlinLogging.logger {  }
/**
 * Using Activity 01 - B, Implement a process where someone can borrow a book.
 * User: Librarian
 * Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
 * Scope : Data Structures
 */
/*
Process:
1. Enter Username and password
2. Welcome UserName
3. Borrow a book? Yes or no Loop
4. Check books borrowed
5. Display books borrowed and burrow limit days
 */

fun main() {


//    Code it

    val logInInfo = HashMap<String, String>()
    logInInfo["Admin"] = "0000"
    logInInfo["Guest"] = "0000"

    logger.info { "Welcome to Activity 01 i! " }

//    loop to enter username and password
    logger.info { "Please Enter your username" }
    var userName = readln()
    logger.info { "Please enter password:" }
    var password = readln()
    while (userName !in logInInfo){
        while (userName !in logInInfo || password != logInInfo.getValue(userName)){
            logger.info { "Not correct username and password" }
            logger.info { "Enter Username" }
            userName = readln()
            logger.info { "Enter password" }
            password = readln()
            if (userName !in logInInfo || password != logInInfo.getValue(userName)){
                logger.info { "Incorrect password for $userName" }
                logger.info { "Enter password" }
                password = readln()
            }
        }

    }
//    welcome the user
    logger.info { "Welcome $userName!" }

//    hashmap books
    val books = HashMap<String, String>()
    books["Harry Potter and Goblet of Fire"] = "Available"
    books["Harry Potter and the Philosopher's Stone"] = "Available"
    books["How to Kill a Mockingbird"] = "Available"
    books["1984"] = "Not Available"
    books["The Lord of The Rings"] = "Not Available"
    books["The Great Gatsby"] = "Available"

//    show all books
    logger.info { "Showing books" }
    for (entry in books.entries) {
        logger.info { "Book Title:${entry.key} , Status:${entry.value}" }
    }

//    check available books
    logger.info { "Available books to borrow" }
    for (entry in books.entries) {
        if (entry.value == "Available") {
            logger.info { entry.key }
        }
    }

//hashmap books
    val borrowBooks = HashMap<String, String>()

//    date formatter
    val formatter = DateTimeFormatter.ISO_DATE
    val startDate = LocalDateTime.now()
//    date entry for borrowing
    val startDateFormatted = startDate.format(formatter)

//    deadline to return book one week(7 days)
    val endDate = startDate.plusDays(7)
    val endDateFormatted = endDate.format(formatter)

// loop yes or no then input book title with checking if it is available
    var input = ""
    while (input != "n") {
        logger.info { "Enter Book title to borrow:" }
        val inputBookTitle = readln()

        if (inputBookTitle in books) {

            if (books[inputBookTitle] == "Available") {
                borrowBooks[inputBookTitle] = "Borrowing"
                logger.info { "$inputBookTitle is added in your borrowed books." }
            } else {
                logger.info { "$inputBookTitle is not available for borrowing." }
            }

        } else {
            logger.info { "$inputBookTitle is not in the book list." }
        }

        logger.info { "Hello $userName! Would you like to borrow a book? Y/N" }
        input = readln()
        while (input != "y" && input != "n") {
            logger.info { "please enter y or n" }
            input = readln()
        }


    }

    logger.info { "Burrowed Books:" }
    for (entry in borrowBooks.entries) {
        logger.info { "Book Title:${entry.key} , Status:${entry.value}" }

        logger.info { "Date Borrowed: $startDateFormatted" }
        logger.info { "Borrow until: $endDateFormatted" }
    }


}


