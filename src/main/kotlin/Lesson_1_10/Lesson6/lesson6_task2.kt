package org.example.Lesson_1_10.Lesson6

const val MILISECONDS_IN_SECOND = 1000L

fun main() {
    println("Введите кол-во секунд")
    val userSeconds = readln().toIntOrNull() ?: 0
    Thread.sleep(userSeconds * org.example.Lesson_1_10.Lesson6.MILISECONDS_IN_SECOND)
    println("Прошло $userSeconds секунд")
}