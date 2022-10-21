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
    logger.info { "Enter a string:" }

    var index = 0
    while (index < 2){
        val inputString = readln()
        index ++

        val inputStringHashMap:HashMap<Char,Int> = HashMap()
        var character : Char

        for (a in inputString.indices) {
            character = inputString[a]
//        the character within the string
            if (inputStringHashMap.containsKey(character)){
                inputStringHashMap[character] = inputStringHashMap[character]!! + 1
// will add 1 if there is more than one of the character
            }else{
                inputStringHashMap[character] = 1
// will not change value other than one
            }

        }
        logger.info { "$inputStringHashMap" }
//        val reversedHashMap = inputStringHashMap.entries.associate{(k,v)-> v to k}
//        to reverse <char,int> to <int, char>
        val uniqueKey = inputStringHashMap.filterValues {it == 1 }.keys
//        this is to check which characters within a string is value of one.
        logger.info { "Unique keys of string $inputString: $uniqueKey" }
    }

}