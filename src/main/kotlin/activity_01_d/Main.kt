package activity_01_d

import mu.KotlinLogging
import java.util.*
private val logger = KotlinLogging.logger{}
fun main() {
    /**
     * Create an application that will accept 5 monetary amounts.
     * After the input is done, the user will be asked “Divide the value by how many?”.
     * It will only accept an Integer as input.
     * The total of the 5  input will be divided by the answer in the second question input.
     * Note: Error checking must be done.
     */


//    SOLUTION 1 : READLINE
    val applicationName : String = "Welcome to Exercise activity_01_d "

    val enterHere : String = "Enter number : "
    var ready = readLine()
    logger.info ("Okay let's proceed enter the first number.")
    logger.info { enterHere }


    var num1 = readLine()!!.toDouble()
    /*
    var num1 = readLine()
    var num1Double = num1.toDouble()
    */
    logger.info { "You entered ₱ $num1. Great! Now enter the second number." }
    println(enterHere)

    var num2 = readLine()!!.toDouble()
    /*
    var num2 = readLine()
    var num2Double = num2.toDouble()
    */
    logger.info { "You entered ₱ $num2. Great! Now enter the third number." }
    logger.info { enterHere }

    var num3 = readLine()!!.toDouble()
    /*
    var num3 = readLine().toDouble()
    var num3Double = num3.toDouble()
    */
    logger.info { "You entered $num3. Great! Now enter the fourth number." }
    logger.info { enterHere }

    var num4 : Double = readLine()!!.toDouble()
    /*
    var num4 = readLine()
    var num4Double = num4.toDouble()
    */
    logger.info { "You entered ₱ $num4. Great! Now enter the fifth number." }
    println(enterHere)

    var num5 : Double = readLine()!!.toDouble()
    /*
    var num5 = readLine()
    var num5Double = num5.toDouble()
    */
    logger.info { "You entered ₱ $num5. Okay! Now enter a number to divide all numbers to." }
    logger.info { enterHere }

    var lastInput : Int = readLine()!!.toInt()
    /*
    var divisor = readLine()
    var divisorDouble = divisor.toDouble()
    */

    logger.info { "Okay the answer is..." }
//        println(((num1Double + num2Double + num3Double +num4Double + num5Double)/divisorDouble).equals(Int))
    logger.info {"₱ ${(num1+num2+num3+num4+num5).toInt()/lastInput.toInt()}" }


//    SOLUTION 2 WHILE LOOP

    logger.info("Input the 5 numbers : ")
    var increment = 0
    var number = 0
    var sum = 0

    while (increment < 5) {
        val scanner = Scanner(System.`in`)
        number = scanner.nextInt()
        sum += number
        increment++
    }
    logger.info{"The sum of 5 numbers is : $sum."}
    logger.info("Enter one more number to divide to sum: ")
    val scanner = Scanner(System.`in`)
    var divisor = scanner.nextInt()
    var total = sum / divisor
    logger.info("The answer is $total")

    if (total is Int) {
        logger.info { "$total is an integer" }
    }

}



