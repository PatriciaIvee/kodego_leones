package activity_05_d_oop

import mu.KotlinLogging

private val logger = KotlinLogging.logger {  }
/**
 * Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction
 *
 * You are tasked to create a game.
 * The game is snake and ladders.
 * Identify and create the class that will be needed to implement Snakes and ladders.
 *
 * Hint:
 *
 * You will need an array to represent the board.
 * You will need snakes, ladders and players.
 * Use all OOP concepts.
 */

/* Idea
 * there should be a dice
 * dice roll function
 * there should be players
 * the board array
 * move function
 * when you get to a snake you go down
 * when you get to a ladder you go up
 *
 */
interface MovePlayers{
    fun moveUp(){}
    fun goDown(){}
}
 abstract class ChangePosition{
//     abstract fun rollDice(){
//         val randomNumber =(1..6).random()
////        generate random numbers
//         logger.info{"Move $randomNumber place/s"}
//     }
     abstract fun rollDice():Int
     abstract fun getPosition():Int
 }

open class Player() :MovePlayers {
    open var playerName:String = ""
    open var position:Int = 0
    override fun moveUp(){}

    override fun goDown() {}
}

class BotPlayer():Player(){
    override var playerName: String = "BOT Player"
    override fun moveUp(){}
    override fun goDown() {}
}

open class Snake(){
    var headOfSnake = 0
    var tailOfSnake = 0

//go down is minus
}
class Ladder():Snake(){
//go up is

}




fun main() {
    val snakesAndLadderBoard =
        arrayOf(1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,
            71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90,
            91,92,93,94,95,96,97,98,99,100)

}
