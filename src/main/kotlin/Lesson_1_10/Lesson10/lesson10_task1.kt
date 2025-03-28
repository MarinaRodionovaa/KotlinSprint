package org.example.Lesson_1_10.Lesson10

fun main() {
    val machineResult = listOf(rollDice(), rollDice())
    println("Бросок машины: $machineResult")
    val humanResult = listOf(rollDice(), rollDice())
    println("Бросок человека: $humanResult")

    if (humanResult.sum() > machineResult.sum()) {
        println("Победило человечество")
    } else if (humanResult.sum() < machineResult.sum()) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }

}

fun rollDice(): Int {
    val range = 1..6
    return range.random()
}