package activity_05_d_oop

import mu.KotlinLogging
import notes.rollDice
import java.util.*

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
 * the board data something
 * move/turn function and turn again function if the dice is 6
 * when you get to a snake you go down
 * when you get to a ladder you go up
 *
 */
val snakesAndLaddersBoard = mapOf( 4 to 14,  9 to 31, 17 to  7, 20 to 38, 28 to 84, 40 to 59, 51 to 67, 54 to 34,
    62 to 19, 63 to 81, 64 to 60, 71 to 91, 87 to 24, 93 to 73, 95 to 75, 99 to 78)

interface MovePlayers{
    fun rollDice(): Int {
        return (1..6).random()

    }
    fun goUp(){}
    fun goDown(){}
    fun random(){}
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

class RollAgain:MovePlayers {
    override fun rollDice(): Int {
        return super.rollDice()
    }

}

open class Player(playerNumber: Int, position: Int) :MovePlayers {
    open var playerName :String = ""
    open var playerColor  :String = ""
    open var isBotPlayer = false
    override fun goUp(){}
    override fun goDown() {}
}


class BotPlayer(playerNumber: Int, position: Int):Player(playerNumber, position) {
    override var isBotPlayer: Boolean
        get() = super.isBotPlayer
        set(value) {}
    override var playerName: String = "BOT Player"
    override fun goUp(){}
    override fun goDown() {}
}

open class Snake(){
   open val mapOfSnakes = mapOf<Int, Int>()

    fun goDown() {}
//go down is minus
}
class Ladder():Snake(){

    override val mapOfSnakes: Map<Int, Int>
        get() = super.mapOfSnakes
//    val mapOfLadders = mapOf<Int, Int>()
    fun goUp(){}
    //go up is plus
}




fun main() {

}
