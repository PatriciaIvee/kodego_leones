package activity_01_g

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
fun main() {

    /**
     * Create an application that will accept 1 string.
     * Your application will print “Palindrome” if the string is a palindrome.
     *
     * Scope: String, Loops
     * Ex:
     * GIRAFARIG - Palindrome
     * 101 - Palindrome
     * RACECAR - Palindrome
     *  GATE - Not Palindrome
     */

//    SOLUTION

    val title = "Welcome to Activity 01 G"
    logger.info { title }
    logger.info { "Please Enter a String." }

    val inputString = readln()
    var reverseInput = inputString.reversed()

    if (inputString.equals(reverseInput,ignoreCase = true)) {
        logger.info { "$inputString - Palindrome" }
    } else {
        logger.info { "$inputString - Not Palindrome." }
    }

}