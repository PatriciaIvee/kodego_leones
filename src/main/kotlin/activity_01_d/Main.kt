package activity_01_d

fun main() {
    val applicationName : String = "Welcome to Exercise activity_01_d "
    println(applicationName)

    var inputInstruction : String = "I will ask you to input 5 amounts are you ready? (Y/N)"
    println(inputInstruction)
    var enterHere : String = "Enter number : "

    var ready = readLine().toString()
    if (ready.uppercase() == "Y" ) {
        println("Okay let's proceed enter the first number.")
        println(enterHere)
        var num1 : String? = readLine().toString()
        println("You entered $num1. Great! Now enter the second number.")
        println(enterHere)
        var num2 : String? = readLine().toString()
        println("You entered $num2. Great! Now enter the third number.")
        println(enterHere)
        var num3 : String? = readLine().toString()
        println("You entered $num3. Great! Now enter the fourth number.")
        println(enterHere)
        var num4 : String? = readLine().toString()
        println("You entered $num4. Great! Now enter the fifth number.")
        println(enterHere)
        var num5 : String? = readLine().toString()
        println("You entered $num5. Okay! Now enter a number to divide all numbers to.")
        println(enterHere)
        var divisor : String? = readLine().toString()
        println("Okay the answer is...")
        println((num1 + num2 + num3 +num4 + num5)/divisor.toInt())
    } else if (ready.uppercase() == "N") {
        println("Okay till next time!")
    } else {
        println("I can't understand you. Please enter Y or N")
    }
}