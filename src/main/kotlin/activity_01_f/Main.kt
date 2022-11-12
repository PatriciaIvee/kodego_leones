package activity_01_f

import mu.KotlinLogging

private val logger = KotlinLogging.logger{}
fun main() {

    /**
     * Create an application that will accept 2 string inputs.
     * Your application will print all unique characters in both Strings.
     * Union of Unique characters in both Strings
     * Example :
     * String 1 : Bird
     * String 2 : Cat
     * Unique : BirdCat
     *
     * Example :
     * String 1 : Bird
     * String 2 : BigBird
     * Unique : gBird
     *
     * Example :
     * String 1 : Eat
     * String 2 : Tea
     * Unique : Tea
     *
     * Scope: String, Loops
     */
//    loop within loop is the solution 1


// SOLUTION 1: HASHMAP

    val title = "Welcome to Activity 01 F"
    logger.info { title }
    logger.info { "Enter a string:" }

        val inputString1 = readln()

        val inputStringHashMap1:HashMap<Char,Int> = HashMap()
        val inputStringHashMap2:HashMap<Char,Int> = HashMap()

        var character : Char

        for (a in inputString1.indices) {
            character = inputString1[a]
//        the character within the string
            if (inputStringHashMap1.containsKey(character)){
                inputStringHashMap1[character] = inputStringHashMap1[character]!! + 1
// will add 1 if there is more than one of the character
            }else{
                inputStringHashMap1[character] = 1
// will not change value other than one
            }
        }

        val inputString2 = readln()
        for (a in inputString2.indices) {
            character = inputString2[a]
//        the character within the string
            if (inputStringHashMap2.containsKey(character)){
                inputStringHashMap2[character] = inputStringHashMap2[character]!! + 1
// will add 1 if there is more than one of the character
            }else{
                inputStringHashMap2[character] = 1
// will not change value other than one
            }

        }
        logger.info { "Unique letters in $inputString1: $inputStringHashMap1 and $inputString2: $inputStringHashMap2" }
//        val reversedHashMap = inputStringHashMap.entries.associate{(k,v)-> v to k}
//        to reverse <char,int> to <int, char>
        val uniqueKey = (inputStringHashMap1 .filterValues { it == 1 }.keys) +
                (inputStringHashMap2 .filterValues { it == 1 }.keys)
//        this is to check which characters within a string is value of one.
        logger.info { "Unique keys of string $inputString1 and $inputString2: $uniqueKey" }

//    SOLUTION 2: SET<CHAR> SOLUTION
    logger.info { title }
    logger.info { "Enter first String: " }
    val string1 = readln()
    logger.info { "Enter Second String: " }
    val string2 = readln()
    val uniqueStr1 = string1.lowercase().toSet()
    val uniqueStr2 = string2.lowercase().toSet()
    val uniqueKeys= (uniqueStr1 + uniqueStr2).toSet()
//    problem here is it is case-sensitive
//    when we add .lowercase/.uppercase it is somewhat case-insensitive

    logger.info { "Unique characters in first input: $uniqueStr1" }
    logger.info { "Unique characters in second input: $uniqueStr2" }
    logger.info { "Unique characters in both inputs: $uniqueKeys" }

//SOLUTION 3: LOOP SOLUTION
    val string3 = readln()
    val char = 'e'
    var count = 0
    for (i in string3.indices){

        if (char ==string3[i]){
            count++
        }
//this only checks frequency of one character(var char) within a string
    }
    logger.info { "Number of $char in $string3 = $count" }
}



