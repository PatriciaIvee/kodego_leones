package activity_01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
fun main() {

    /**
     * Create an application that will accept 2 string inputs.
     *  Your application will print all unique characters in both Strings.
     *
     *  Scope: String, Loops
     */

// SOLUTION

    val title = "Welcome to Activity 01 F"
    logger.info { title }
    var stringInput = 1

    while (stringInput <=2){
        logger.info { "Please enter a string value: " }
        logger.info { "" }
         val enterString = readLine()

         if (enterString.isNullOrEmpty()){
             logger.error { "String is blank" }
         } else {
             stringInput += 1
         }
    }

}