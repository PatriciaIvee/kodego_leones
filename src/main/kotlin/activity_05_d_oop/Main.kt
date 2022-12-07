package activity_05_d_oop

import mu.KotlinLogging
import kotlin.collections.ArrayList

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
val snakesAndLaddersBoard = mapOf(
    4 to 14, 9 to 31, 17 to 7, 20 to 38, 28 to 84,
    40 to 59, 51 to 67, 54 to 34, 62 to 19, 63 to 81,
    64 to 60, 71 to 91, 87 to 24, 93 to 73, 95 to 75,
    99 to 78)

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
fun addPlayer(player: Player): ArrayList<Player> {
    var playersList :ArrayList<Player> = ArrayList()
    playersList.add(player)
    return playersList
}

fun removePlayer(player: Player): ArrayList<Player> {
    var playersList :ArrayList<Player> = ArrayList()
    playersList.remove(player)
    return playersList
}
open class Player(playerNumber: Int, position: Int) :MovePlayers {
    open var playerName :String = ""
    open var playerColor :String = ""
    open var isBotPlayer = false
    override fun goUp(){}
    override fun goDown() {}
}

class BotPlayer(playerNumber: Int, position: Int):Player(playerNumber, position) {

    override var playerName: String = "BOT Player"
    override var isBotPlayer: Boolean = false
        get() = super.isBotPlayer
        set(value) { field = true}
    override fun goUp(){}
    override fun goDown() {}
}

open class Snake(){
//    Go Down
   private val mapOfSnakes = mapOf<Int, Int>(16 to 6, 47 to 26, 49 to 11, 56 to 53, 62 to 19,
    64 to 60, 87 to 24, 93 to 73, 95 to 75, 98 to 78,)

    open fun move(player: Player, position: Int) {
        for (number in mapOfSnakes.keys){
            if (position == number){
               val newPosition = mapOfSnakes.getValue(number)
                return move(player,newPosition)
            }
        }

    }
}
class Ladder():Snake(){
//    Go Up

   private var mapOfLadders = mapOf<Int,Int>(1 to 38, 4 to 14, 9 to 31, 21 to 42,
       28 to 84, 36 to 44, 51 to 67, 71 to 91, 80 to 100)
    override fun move(player: Player, position: Int) {
        for (number in mapOfLadders.keys){
            if (position == number) {
                val newPosition = mapOfLadders.getValue(number)
                return move(player, newPosition)
            }
        }
    }

}




fun main() {

}
