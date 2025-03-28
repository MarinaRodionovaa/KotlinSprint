package org.example.Lesson_1_10.Lesson7

const val MILLISECONDS_IN_SECOND = 1000L
const val STUB_NULL = 0

fun main() {
    println("Введите количество секунд, которые нужно засечь")
    val userSeconds = readln().toIntOrNull() ?: STUB_NULL

    for (i in userSeconds downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }

    println("Время вышло")
}