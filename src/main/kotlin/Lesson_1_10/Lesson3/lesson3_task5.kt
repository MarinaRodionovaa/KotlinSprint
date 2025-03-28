package org.example.Lesson_1_10.Lesson3

fun main() {
    val userMove = "D2-D4;0"
    val moveList = userMove.split("-", ";")
    val moveFrom = moveList[0]
    val moveTo = moveList[1]
    val moveNumber = moveList[2]

    println(moveFrom + "\n" + moveTo + "\n" + moveNumber)
}