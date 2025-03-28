package org.example.Lesson_1_10.Lesson5

fun main() {
    val firstNumber = 33
    val secondNumber = 23

    println("Введите два числа от 0 до 42")
    println("Введите первое число")
    val userFirstNumber = readLine()?.toIntOrNull() ?: -1
    println("Введите второе число")
    val userSecondNumber = readLine()?.toIntOrNull() ?: -1
    val userNumbersList = listOf(userFirstNumber, userSecondNumber)

    if (firstNumber in userNumbersList
        && secondNumber in userNumbersList
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumber in userNumbersList
        || secondNumber in userNumbersList
    ) {
        println("Вы выиграли утешительный приз!")

    } else {
        println("Неудача!")
    }

}