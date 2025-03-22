package org.example.Lesson6

const val MILLISECONDS_IN_SECOND = 1000L

fun main() {
    println("Введите кол-во секунд")
    val userSeconds = readln().toIntOrNull() ?: 0
    Thread.sleep(userSeconds * MILLISECONDS_IN_SECOND)
    println("Прошло $userSeconds секунд")
}