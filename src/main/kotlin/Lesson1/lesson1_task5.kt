package org.example.Lesson1

const val TIME_UNITS_PER_LEVEL = 60

fun main() {

    var seconds: Int = 6480

    val minutes: Int = seconds / TIME_UNITS_PER_LEVEL % TIME_UNITS_PER_LEVEL
    val hours: Int = seconds / TIME_UNITS_PER_LEVEL / TIME_UNITS_PER_LEVEL
    seconds = seconds % TIME_UNITS_PER_LEVEL

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}