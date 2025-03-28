package org.example.Lesson_1_10.Lesson5

const val FIRST_NUMBER = 8
const val SECOND_NUMBER = 4

fun main() {

    println("Для авторизации необходимо пройти проверку на бота\nРешите пример\n$FIRST_NUMBER + $SECOND_NUMBER = ")
    val userAnswer = readLine()?.toIntOrNull() ?: 0

    if (userAnswer == FIRST_NUMBER + SECOND_NUMBER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}