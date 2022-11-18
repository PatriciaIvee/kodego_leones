package oop

//Multiple Inheritance

/*
* person <- Student
*        <-teacher, guidance counselor <-dean
*        <-parent
*
*
* rook
* bishop
* pawn
* king
* queen
* knight
* horse
*
*
* */

interface ChessPieceMoves{
    fun move()
    fun capture()
}

//pwedeng walang implementation yung methods ng abstract class

class Rook: ChessPieceMoves{
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun capture() {
        TODO("Not yet implemented")
    }
}

abstract class ChessMoves()