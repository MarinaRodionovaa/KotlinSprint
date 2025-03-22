package org.example.Lesson6

const val STUB_NULL = 0

fun main() {
    val range = 1..9
    val secretNumber = (range).random()

    println("У вас есть 5 попыток чтобы угадать число")
    var userNumber = 0
    var userTry = 5
    while (userNumber != secretNumber && userTry > 0) {
        userNumber = readln().toIntOrNull() ?: STUB_NULL
        if (userNumber != secretNumber) {
            println("Не верно, осталось попыток: ${--userTry}")
        } else {
            println("Это была великолепная игра!")
        }
    }
    println("Было загадано число $secretNumber")
}