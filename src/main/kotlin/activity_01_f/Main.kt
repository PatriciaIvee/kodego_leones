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
    println("Enter a string:")

    var index = 0
    while (index < 2){
        val inputString = readln()
        index ++

        val inputStringHashMap:HashMap<Char,Int> = HashMap()
        var theChar : Char

        for (a in inputString.indices) {
            theChar = inputString[a]
//        the character within the string
            if (inputStringHashMap.containsKey(theChar)){
                inputStringHashMap[theChar] = inputStringHashMap[theChar]!! + 1
// will add 1 if there is more than one more of the character
            }else{
                inputStringHashMap[theChar] = 1
// will not change value other than one
            }

        }
        println("$inputStringHashMap")

    }







}