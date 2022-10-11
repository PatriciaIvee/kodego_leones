package activity_01_d

fun main() {
    val applicationName : String = "Welcome to Exercise activity_01_d "
    println(applicationName)

    var inputInstruction : String = "I will ask you to input 5 monetary amounts are you ready? (Y/N)"
    println(inputInstruction)
    var enterHere : String = "Enter number : "

    var ready = readLine().toString()
    if (ready.uppercase() == "Y" ) {
        println("Okay let's proceed enter the first number.")
        println(enterHere)

       var num1 = readLine()!!.toDouble()
        /*
        var num1 = readLine()
        var num1Double = num1.toDouble()
        */
        println("You entered ₱ $num1. Great! Now enter the second number.")
        println(enterHere)

       var num2 = readLine()!!.toDouble()
        /*
        var num2 = readLine()
        var num2Double = num2.toDouble()
        */
        println("You entered ₱ $num2. Great! Now enter the third number.")
        println(enterHere)

        var num3 = readLine()!!.toDouble()
        /*
        var num3 = readLine().toDouble()
        var num3Double = num3.toDouble()
        */
        println("You entered $num3. Great! Now enter the fourth number.")
        println(enterHere)

        var num4 : Double = readLine()!!.toDouble()
        /*
        var num4 = readLine()
        var num4Double = num4.toDouble()
        */
        println("You entered ₱ $num4. Great! Now enter the fifth number.")
        println(enterHere)

        var num5 : Double = readLine()!!.toDouble()
        /*
        var num5 = readLine()
        var num5Double = num5.toDouble()
        */
        println("You entered ₱ $num5. Okay! Now enter a number to divide all numbers to.")
        println(enterHere)

        var divisor : Int = readLine()!!.toInt()
        /*
        var divisor = readLine()
        var divisorDouble = divisor.toDouble()
        */

        println("Okay the answer is...")
//        println(((num1Double + num2Double + num3Double +num4Double + num5Double)/divisorDouble).equals(Int))
        println("₱ ${(num1+num2+num3+num4+num5).toInt()/divisor.toInt()}")

    } else if (ready.uppercase() == "N") {
        println("Okay till next time!")
    } else {
        println("I can't understand you. Please enter Y or N")
    }
}