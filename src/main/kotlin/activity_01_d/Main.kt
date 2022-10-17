package activity_01_d

import mu.KotlinLogging
private val logger = KotlinLogging.logger{}
fun main() {
    /**
     * Create an application that will accept 5 monetary amounts.
     * After the input is done, the user will be asked “Divide the value by how many?”.
     * It will only accept an Integer as input.
     * The total of the 5  input will be divided by the answer in the second question input.
     * Note: Error checking must be done.
     */

//    SOLUTION 1
    logger.info { "Welcome to Activity 01 D" }
    logger.info { "Please enter 5 integers" }
    var i = 1
    var sum = 0

    while (i <= 5) {
// while loop to enter 5 numbers
        logger.info {"Input # $i"}
        val userInput = readLine()
// readLine = string value
        if (userInput != null && userInput.all { char -> char.isDigit() } ) {
            val userInputInt = userInput.toIntOrNull()
//            it will convert string (readLine) into integer
            if (userInputInt != null) {
//                    it will check if the input is not blank
                sum += userInputInt
//                    user input integer is added until we reach 5 integer userInput
            } else {
//                    it will print this statement if the input is blank
                logger.info { "User did not enter a value. Counted as null." }
            }
        } else {
            logger.info { "Please enter an integer value : " }
            i -= 1
            /* it will deduct i if you didn't enter an integer.
            It will continue the loop unless it reaches five integer userInputs

             */
        }
//        if the input is an integer there is increment
        ++i
    }
    logger.info { "The sum is : $sum" }
    logger.info { "Please enter one more value as divisor: " }

    while (i <= 6 ) {
//since we stopped at 5 i we also created a loop for a correct divisor input (integer)
        val userInputDivisor = readLine()
        logger.info { "Input divisor $userInputDivisor" }
// we create a new read line for divisor input
        if (userInputDivisor != null && userInputDivisor.all { char -> char.isDigit() } ) {
            val userInputInt = userInputDivisor.toIntOrNull()
            if (userInputInt != null) {
                val total = sum / userInputInt
                logger.info { "The total is : $total" }
            } else {
                logger.info { "User did not enter a value. Counted as null." }
                logger.info { "Sum : $sum" }
                logger.info { sum / 0 } // program throws an error because anything divided by zero is invalid
            }
        }   else {
            logger.info { "Please enter an integer value :" }
            i -= 1
        }
        ++i
    }

}



