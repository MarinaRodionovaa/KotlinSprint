package org.example.Lesson6

const val MILISECONDS_IN_SECOND = 1000L

fun main() {
    println("Введите кол-во секунд")
    val userSeconds = readln().toIntOrNull() ?: 0
    Thread.sleep(userSeconds * MILISECONDS_IN_SECOND)
    println("Прошло $userSeconds секунд")
}