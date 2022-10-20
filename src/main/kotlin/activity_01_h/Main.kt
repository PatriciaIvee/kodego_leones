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

    logger.info { "Please enter 2 integers" }
    logger.info { "Start" }
    var inputInt1 = readln().toInt()
    logger.info { "End" }
    var inputInt2 = readln().toInt()
    var integerRange = inputInt1 .. inputInt2

    val list: MutableList<Long> = ArrayList()
//    var index = 0
//    do {
//
//
//        index ++
//    } while (index < 2)

}