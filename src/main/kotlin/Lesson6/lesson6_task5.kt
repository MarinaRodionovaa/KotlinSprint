package org.example.Lesson6

const val STUB_NULL = 0

fun main() {
    val range = 1..9
    println("Пройдите проверку на бота\nРешите пример")
    var userTry = 3

    while (userTry > 0) {

        val firstNumber = (range).random()
        val secondNumber = (range).random()

        println("$firstNumber + $secondNumber = ")
        val userAnswer = readln().toIntOrNull() ?: STUB_NULL
        userTry--
        if (userAnswer == (firstNumber + secondNumber)) {
            println("Добро пожаловать!")
            break
        } else if (userTry == 0) {
            println("Доступ запрещен")
        }

    }

}