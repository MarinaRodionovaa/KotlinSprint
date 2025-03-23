package org.example.Lesson6

const val MILLISECONDS_IN_SECOND = 1000L
const val STUB_NULL_1 = 0

fun main() {

    println("Введите кол-во секунд")
    var userSeconds = readln().toIntOrNull() ?: STUB_NULL_1
    while (userSeconds > 0) {
        println("Осталось секунд: ${userSeconds--}")
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }

    println("Время вышло")

}