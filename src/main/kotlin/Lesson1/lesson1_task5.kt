package org.example.Lesson1

fun main() {

    val seconds = 6480

    val minutes = ("0"+(seconds / 60 % 60).toString()).takeLast(2)
    val hours = ("0"+(seconds / 60 / 60).toString()).takeLast(2)
    val stringSeconds = ("0"+(seconds % 60).toString()).takeLast(2)


    println("$hours:$minutes:$stringSeconds")
}