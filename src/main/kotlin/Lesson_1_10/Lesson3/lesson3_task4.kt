package org.example.Lesson_1_10.Lesson3

fun main() {
    var chessMoveFrom = "E2"
    var chessMoveTo = "E4"
    var chessMoveNumber = 1

    println("[$chessMoveFrom-$chessMoveTo;$chessMoveNumber]")

    chessMoveFrom = "D2"
    val letterTo = chessMoveFrom.replace(Regex("[^A-Z]"), "")
    val numberTo = chessMoveFrom.replace(Regex("[^0-9]"), "").toInt() + 1
    chessMoveTo = letterTo + numberTo
    chessMoveNumber += 1

    println("[$chessMoveFrom-$chessMoveTo;$chessMoveNumber]")

}