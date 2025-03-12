package org.example.Lesson1

fun main() {

    val seconds: Int = 6480

    val minutes: String = ("0"+(seconds / 60 % 60).toString()).takeLast(2)
    val hours: String = ("0"+(seconds / 60 / 60).toString()).takeLast(2)
    val stringSeconds: String = ("0"+(seconds % 60).toString()).takeLast(2)


    println("$hours:$minutes:$stringSeconds")
}