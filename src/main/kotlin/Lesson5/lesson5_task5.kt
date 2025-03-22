package org.example.Lesson5

fun main() {
    val range = 0..42

    val numbersList = listOf((range).random(), (range).random(), (range).random())

    println("Введите три числа от 0 до 42")
    println("Введите первое число")
    val userFirstNumber = readLine()?.toIntOrNull() ?: -1
    println("Введите второе число")
    val userSecondNumber = readLine()?.toIntOrNull() ?: -1
    println("Введите третье число")
    val userThirdNumber = readLine()?.toIntOrNull() ?: -1

    val userNumbersList = listOf(userFirstNumber, userSecondNumber, userThirdNumber)

    val checkNumbers = numbersList.intersect(userNumbersList)

    val itog = when (checkNumbers.size) {
        1 -> "Вы выиграли утешительный приз"
        2 -> "Вы угадали два числа и получаете крупный приз"
        3 -> "Вы выиграли джекпот"
        else -> "Вы не угадали ни одного числа"
    }

    println(itog)
    println("Загаданные числа $numbersList")

}