package org.example.Lesson_1_10.Lesson10

fun main() {

    var work = true
    var countOfWin = 0
    while (work) {

        val machineResult = listOf(rollDice(), rollDice())
        val humanResult = listOf(rollDice(), rollDice())
        println("Бросок машины: $machineResult")
        println("Бросок человека: $humanResult")

        if (humanResult.sum() > machineResult.sum()) {
            println("Победило человечество")
            countOfWin += 1
        } else if (humanResult.sum() < machineResult.sum()) {
            println("Победила машина")
        } else {
            println("Победила дружба")
        }

        work = isСontinue()

    }
    println("Вы выиграли $countOfWin партий")
}

fun rollDice(): Int {
    val range = 1..6
    return range.random()
}

fun isСontinue(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    if (readln().equals("да", ignoreCase = true)) {
        return true
    } else {
        return false
    }
}