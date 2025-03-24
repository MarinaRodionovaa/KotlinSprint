package org.example.Lesson10

fun main() {

    var work = 1
    var countOfWin = 0
    while (work == 1) {

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

fun isСontinue(): Int {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    if (readln().equals("да", ignoreCase = true)) {
        return 1
    } else {
        return 0
    }
}