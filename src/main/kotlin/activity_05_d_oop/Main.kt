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


open class Player(var playerNumber: Int, var position: Int) : MovePlayers {
    open var playerName: String = ""
    open var playerColor: String = ""
    open var isBotPlayer = false

    override fun goUp() {}
    override fun goDown() {}

    fun movePlayer(numberOfSpaces: Int) {
        position += numberOfSpaces
    }

    fun hasWon(): Boolean {
        return position > 100 || position == 100
    }
}
abstract class ChangePosition {
    abstract fun movePlayerOnBoard(player: Player, numberOfSpaces: Int)
    open fun rollDice(): Int {
        return (1..6).random()
    }
}
class RollAgain : ChangePosition() {
    override fun rollDice(): Int {
        val roll = super.rollDice()
        if (roll == 6) {
            logger.info{"You rolled a 6! Roll again."}
            val nextRoll = rollDice()
            logger.info{"For the second time you rolled $nextRoll"}
            logger.info{"$roll + $nextRoll"}
            return roll + nextRoll
        }

        return roll
    }

    override fun movePlayerOnBoard(player: Player, numberOfSpaces: Int) {
        player.movePlayer(numberOfSpaces)
    }
}

interface MovePlayers{
    fun rollDice(): Int {
        return (1..6).random()
    }

    fun goUp(){}
    fun goDown(){}
}

fun addPlayer(playersList: ArrayList<Player>, newPlayer: Player): ArrayList<Player> {
    playersList.add(newPlayer)
    return playersList
}

fun removePlayer(playersList: ArrayList<Player>, playerToRemove: Player): ArrayList<Player> {
    playersList.remove(playerToRemove)
    return playersList
}

//fun removePlayer(player: Player): ArrayList<Player> {
//    var playersList :ArrayList<Player> = ArrayList()
//    playersList.remove(player)
//    return playersList
//}

class BotPlayer(playerNumber: Int, position: Int):Player(playerNumber, position) {

    override var playerName: String = "BOT Player"
    override var isBotPlayer: Boolean = false
        get() = super.isBotPlayer
        set(value) { field = true}
    override fun goUp(){}
    override fun goDown() {}
}


class Snakes(private val board: Array<IntArray>) {

    private val snakes = mapOf(
        16 to 6, 47 to 26, 49 to 11, 56 to 53, 62 to 19,
        64 to 60, 87 to 24, 93 to 73, 95 to 75, 98 to 78,
    )

    fun moveDown(player: Player, position: Int) {
        val snakeTail = snakes[position] ?: return // check if there's a snake at this position
        player.position = snakeTail
        logger.info {"Landed on A Snake ! Move to Position $snakeTail" }
    }
}

class Ladders(private val board: Array<IntArray>): MovePlayers{

    private val ladders = mapOf(
        1 to 38, 4 to 14, 9 to 31, 21 to 42,
        28 to 84, 36 to 44, 51 to 67, 71 to 91, 80 to 100,
    )

    fun moveUp(player: Player, position: Int) {

        val ladderTop = ladders[position] ?: return // check if there's a ladder at this position
        player.position = ladderTop
        logger.info { "Landed on A Ladder! Move to Position $ladderTop"  }

    }
}


fun main() {
    var playerList: ArrayList<Player> = ArrayList()

    // Add Players
    var player = Player(1, 0)
    player.playerName = "Joanna"
    player.playerColor = "Blue"
    addPlayer(playerList,player)

    player = Player(2,0)
    player.playerName = "Hannah"
    player.playerColor = "Red"
    addPlayer(playerList, player)

    player = BotPlayer(3,0)
    player.playerColor = "Orange"
    addPlayer(playerList, player)

    // Create the game board
    val snakesAndLaddersBoardArray = Array(10) { row ->
        IntArray(10) { column -> row * 10 + column + 1 }
    }
    //  Create an Array of 10
    //row * 10 determines that what numbers are inside each row since its multiple of 10
    // column + 1 Column Start at one Then Column number value will increment until it reaches the end of row





    // Create the game components
    val rollAgain = RollAgain()
    val snakes = Snakes(snakesAndLaddersBoardArray)
    val ladders = Ladders(snakesAndLaddersBoardArray)

    // Game loop
    while (true) {
        for (player in playerList) {
            logger.info { "Player ${player.playerNumber} (${player.playerName})'s turn" }

            // Roll the dice
            val roll = rollAgain.rollDice()
            logger.info {"Rolled a $roll"}

            // Move the player
            val newPosition = player.position + roll
            if (newPosition > 100) {
                logger.info { "You need to roll a ${100 - player.position} or less to reach the end" }
            } else {
                player.position = newPosition
                logger.info { "Moved to position ${player.position}" }

                // Check if the player landed on a snake or ladder
                snakes.moveDown(player, player.position)
                ladders.moveUp(player, player.position)

                // Check if the player won
                if (player.hasWon()) {
                    logger.info { "Player ${player.playerNumber} has won!" }
                    return
                }
            }
        }
    }
}
