package activity_02_d

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
fun main() {
    /**
     * Implement Activity 01 - D using data structure.
     */

//    SOLUTION 1 THE OLD SOLUTION JUST ADDED WITH ARRAYLIST
    logger.info { "Welcome to Activity 02 D" }

    logger.info { "Please enter 5 integers" }
    var i = 1
    val ints = ArrayList<Int>()

    while (i <= 5) {

        logger.info {"Input # $i"}
        val userInput = readLine()

        if (userInput != null && userInput.all { char -> char.isDigit() } ) {
            val userInputInt = userInput.toIntOrNull()

            if (userInputInt != null) {
                ints.add(userInputInt)
            } else {
                logger.info { "User did not entered blank, counted as 0" }
                ints.add(0)
            }
        } else {
            logger.info { "Please enter an integer value : " }
            --i
        }
        ++i
    }
    logger.info { "The numbers are : $ints" }
    val sum = ints.sum()
    logger.info{"The sum is $sum" }

    while (i <= 6 ) {
        logger.info { "Type an integer as the divisor." }
        val userInputDivisor = readLine()
        logger.info { "You Typed $userInputDivisor as the divisor." }

        if (userInputDivisor != null && userInputDivisor.all { char -> char.isDigit() } ) {
            val userInputInt = userInputDivisor.toIntOrNull()
            if (userInputInt != null ) {
                if (userInputInt != 0){

                    val total = sum / userInputInt
                    logger.info { "The total is : $total" }
                } else {
                    logger.info { "You entered zero. This cannot be!" }
                    logger.info { "Sum : $sum" }
                }

            } else {
                logger.info { "User did not enter a value. Counted as null." }
                logger.info { "Sum : $sum" }

            }
        }   else {
            logger.info { "Please enter an integer value :" }
            i -= 1
        }
        ++i
    }

//    SOLUTION 2 : JUST THE ARRAY ITSELF
    logger.info { "please enter 5 digits/ integers" }
    val intArray = ArrayList<Int>()
    repeat(5){
        val userInput2 = readln().toInt()
        intArray.add(userInput2)
    }
    logger.info { "Sum of $intArray" }
    val sumOfIntArray = intArray.sum()
    logger.info { "Sum is $sumOfIntArray" }
    logger.info{ "Enter one more number to divide the last 5 digit inputs"}

    do{
        val inputDivide = readln().toInt()
        if (inputDivide != 0 ){
           val answer= sumOfIntArray / inputDivide
            logger.info { "Answer is $answer" }
        }
    } while (inputDivide == 0)

}