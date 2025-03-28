package org.example.Lesson_1_10.Lesson10

fun main() {
    val machineResult = listOf(rollDice1(), rollDice1())
    println("Бросок машины: $machineResult")
    val humanResult = listOf(rollDice1(), rollDice1())
    println("Бросок человека: $humanResult")

    if (humanResult.sum() > machineResult.sum()) {
        println("Победило человечество")
    } else if (humanResult.sum() < machineResult.sum()) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }

}

fun rollDice1(): Int {
    val range = 1..6
    return range.random()
}