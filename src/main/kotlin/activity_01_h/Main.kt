package activity_01_h

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
fun main() {

    /**
     * Create an application that will accept 2 Integers.
     * It will identify the lower value and bigger value of the two inputs.
     * Then, your application will print all the prime numbers starting
     * from the lower number up to the largest number.
     */

//    SOLUTION
    logger.info { "Welcome to Activity 01 H" }
    logger.info { "Please enter 2 integers" }
    logger.info { "Start of Range : " }
    var inputInt1 = readln().toInt()
    logger.info { "End of Range :" }
    val inputInt2 = readln().toInt()
//    var integerRange = inputInt1 .. inputInt2
    logger.info { "Prime numbers for range $inputInt1 to $inputInt2 .." }
    while (inputInt1 < inputInt2) {
//        loop to keep moving from start of range until the end.
        var notPrimeNumber = false
//        condition if is not a prime number
        for (i in 2.. inputInt1 / 2) {
//            number will move 2 places start range then /2 ?
            if (inputInt1 % i == 0) {
//                if the input1 Start is equal to 0 when divided by 2 no  remainder
                notPrimeNumber = true
                break

            }
        }
        if (!notPrimeNumber) {
        logger.info ("Prime number : $inputInt1")
//            will print the number if it is a prime number
        }
        ++ inputInt1
    }

}