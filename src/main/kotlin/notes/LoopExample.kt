package notes

fun main() {
//Repeat will repeat the command you gave it in this case it will repeat printing a line for 10 times
    repeat(10) {
        println("$it -> This is Repeat Loop")
    }

    for (counter in 0 .. 10) {
        println("$counter: for loop")
    }
// counter is a usually used variable for "For Loop"

    for (counter in 0 until 10) {
        println("$counter: For Loop")
    }
//    until will stop doing a loop until a certain number

    for (counter in 0 .. 10 step 2) {
        println("$counter: For Loop")
    }
/*    step means it will skip numbers in this case it will skip 1 number
it will only print numbers 2 "steps" within the range
 */

    var userInput = "1234"
    var numbers = '0' .. '9'

    for (index in 0 until userInput.length) {
        var char = userInput[index]
        println("Char : $char")
    }
  /* I think this block of code will look for the index of string until the length of the string
  user inputted
   */

    var userInput2 = "123456793"
    var index = 0
    do {
        val char = userInput2[index]
        println("Char : $char")
    } while (true)
//    this will result into infinite loop
//the code is stucked at the first index, and it won't move

//    a better way to do it
    var userInput3 = "123456789393"
    val found = false
    do {
        val char = userInput3[index]
        println("Char : $char")
        index ++

        if (char == '9') {
            found = true
            println("Found a 9")
        }
    } while ((index<userInput3.length) && !found)





}