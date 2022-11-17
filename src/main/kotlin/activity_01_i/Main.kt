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
    logger.info { "Welcome to Activity 01 i! Please Enter your username and password:" }
    val userName = readln()
    val password = readln()
    val logInInfo= HashMap<String, String>()
    logInInfo[userName] = password

    val books = HashMap<String, String>()
    books["Harry Potter and Goblet of Fire"] = "Available"
    books["Harry Potter and the Philosopher's Stone"] = "Available"
    books["How to Kill a Mockingbird"] = "Available"
    books["1984"] = "Not Available"
    books["The Lord of The Rings"] = "Not Available"
    books["The Great Gatsby"] = "Available"

    logger.info { "Showing books" }
    for (entry in books.entries){
        logger.info { "Book Title:${ entry.key } , Status:${entry.value}" }
    }
    logger.info { "Available books to borrow" }
    for (entry in books.entries){
        if (entry.value == "Available"){
            logger.info { entry.key }
        }
    }


    val borrowBooks = HashMap<String,String>()
    val formatter = DateTimeFormatter.ISO_DATE
    val startDate = LocalDateTime.now()
    val startDateFormatted = startDate.format(formatter)
    val endDate = startDate.plusDays(7)
    val endDateFormatted = endDate.format(formatter)

    var index = 0

    while (index == 0){
        logger.info { "Hello $userName! Would you like to borrow a book? Y/N" }
        val input = readLine()
        index = when (input) {
            "Y", "y" -> {

                logger.info { "Enter Book title to borrow:" }
                    val inputBookTitle = readln()

                    if (inputBookTitle in books.keys ){
                        borrowBooks[inputBookTitle] = "Borrowed"
                    } else {
                        logger.info { "$inputBookTitle is not in the books or is not available." }
                    }

                logger.info { "Burrowed Books:" }
                for(entry in borrowBooks.entries){
                    logger.info { "Book Title:${ entry.key } , Status:${entry.value}" }

                    logger.info { "Date Borrowed: $startDateFormatted" }
                    logger.info { "Borrow until: $endDateFormatted" }
                }

                1

            }

            "N", "n" -> {
                logger.info { "Thank you Have a nice day" }
                1
            }

            else -> {
                logger.info { "Please enter Y/y or N/n" }
                0
            }
        }
    }

}