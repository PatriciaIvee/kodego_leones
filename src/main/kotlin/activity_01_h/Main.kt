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
//More efficient code is to make an arrayList of prime numbers and check if it matches within the range of
//    the entries

//    Compare which entry is higher/larger between the two entries
//    turn a to b range if "a" is higher than "b" and "b" to "a" range if the other way around

//    SOLUTION
    val primeNumberArray:ArrayList<Int> = arrayListOf(
        2,3,5,7,11,13,17,19,23,29,
        31,37,41,43,47,53,59,61,67,71,
        73,79,83,89,97,101,103,107,109,113,
        127,131,137,139,149,151,157,163,167,173,
        179,181,191,193,197,199,211,223,227,229,
        233,239,241,251,257,263,269,271,277,281,
        283,293,307,311,313,317,331,337,347,349,
        353,359,367,373,379,383,389,397,401,409,
        419,421,431,433,439,443,449,457,461,463,
        467,479,487,491,499,503,509,521,523,541,
        547,557,563,569,571,577,587,593,599,601,
        607,613,617,619,631,641,643,647,653,659,
        661,673,677,683,691,701,709,719,727,733,
        739,743,751,757,761,769,773,787,797,809,
        811,821,823,827,829,839,853,857,859,863,
        877,881,883,887,907,911,919,929,937,941,
        947,953,967,971,977,983,991,997,1009,1013,
        1019,1021,1031,1033,1039,1049,1051,1061,1063,1069,
        1087,1091,1093,1097,1103,1109,1117,1123,1129,1151,
        1153,1163,1171,1181,1187,1193,1201,1213,1217,1223)

    logger.info { "Welcome to Activity 01 H 1st solution" }
    logger.info { "Input number1 " }
    val integerRange:IntRange
    val inputInt1 = readln().toInt()
    logger.info { "Input number2" }
    val inputInt2 = readln().toInt()
    integerRange = if (inputInt1 < inputInt2){
//        logger.info { "condition 1 $inputInt2 is greater than $inputInt1" }
        inputInt1..inputInt2
    }   else {
//        logger.info { "condition 2 $inputInt1 is greater than $inputInt2" }
//        switches the range start and end
        inputInt2..inputInt1
    }
    logger.info { "Prime numbers from $integerRange" }
    for (i in integerRange){
        if(i in primeNumberArray){
           logger.info { i }
//            Range only valid until 1223
        }
    }

//    SOLUTION 2: MY OLD SOLUTION WITH MODULUS
    logger.info { "Welcome to Activity 01 H 2nd solution" }
    logger.info { "Please enter 2 integers" }

    var inputInt3 = readln().toInt()
    logger.info { "Input number2" }
    val inputInt4 = readln().toInt()

    logger.info { "Prime numbers for range $inputInt3 to $inputInt4 .." }
    while (inputInt3 < inputInt4 ) {
//        loop to keep moving from start of range until the end.
        var notPrimeNumber = false
//        condition if is not a prime number
        for (i in 2.. inputInt3 / 2) {
//            number will move 2 places start range then /2
            if (inputInt3 % i == 0) {
//                if the input1 Start is equal to 0 when divided by 2 no  remainder
                notPrimeNumber = true
                break
            }
        }
        if (!notPrimeNumber) {
            logger.info ("Prime number : $inputInt3")
//            will print the number if it is a prime number
        }
       ++inputInt3
    }


//    SOLUTION 3: ANOTHER SOLUTION COMPUTATION WITHOUT %(MODULUS)
    logger.info { "Welcome to Activity 01 H 3rd solution" }
    logger.info { "Please enter 2 integers" }
    logger.info { "enter 1st integer" }
    val inputInt5 = readln().toInt()
    logger.info { "enter second integer" }
    val inputInt6 = readln().toInt()
    val integerRange2 = if (inputInt5 < inputInt6){
//        logger.info { "condition 1 $inputInt2 is greater than $inputInt1" }
        inputInt5..inputInt6
    }   else {
//        logger.info { "condition 2 $inputInt1 is greater than $inputInt2" }
//        switches the range start and end
        inputInt6..inputInt5
    }
    logger.info { "Prime numbers for $integerRange2" }
    for (i in integerRange2 ){

        if ( i-2*(i/2) == 1 || i/2 == 1){
//            can't capture 2 that is why there is an or condition for 2
//            conditions of a prime number if it can only be divided by 1 and itself
//            some say 1 is not a prime number because it can only be divided by itself
//            criteria should be it can only be divided by 2 numbers
            logger.info { i }
        }
    }
}