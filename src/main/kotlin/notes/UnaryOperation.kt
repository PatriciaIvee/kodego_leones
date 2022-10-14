fun main() {
    var increment = 0
    var decrement = 0
    var plusPlus = 0
    var minusMinus = 0

    //    increment + 1
    //    increment += 1

    //    decrement - 1
    //    increment -= 1

    //    plusPlus = ++
    //    minusMinus = --

    increment = 2
    println("Increment : $increment")
    println(++ increment)
    //   by adding plusplus(increment) before the var, the value of var will be incremented by 1
    println(increment ++)
    /* by adding the plusplus (increment) after the var,the value of var
    will be returned first then it will be incremented by 1
     */

    decrement = 2
    println("Decrement : $decrement")

    println(--decrement)
    //   by adding plusplus(increment) before the var, the value of var will be incremented by 1
    println(decrement --)
    /* by adding the minusminus (decrement) after the var,the value of var
    will be returned first then it will be incremented by 1
     */

    increment += 2
    println("Increment : $increment")

    decrement -= 2
    println("Increment : $decrement")

    println("Plus plus: ${plusPlus++}")
    println("Minus minus:${--minusMinus}")
}