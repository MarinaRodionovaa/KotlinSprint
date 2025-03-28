package org.example.Lesson_1_10.Lesson2

const val TIME_UNITS_PER_LEVEL = 60

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val minutesInWay: Int = 457

    val arrivalMinute: Int = (departureMinute + (minutesInWay % TIME_UNITS_PER_LEVEL)) % TIME_UNITS_PER_LEVEL
    val arrivalHour: Int =
        departureHour + minutesInWay / TIME_UNITS_PER_LEVEL + (departureMinute + (minutesInWay % TIME_UNITS_PER_LEVEL)) / TIME_UNITS_PER_LEVEL

    println("Время прибытия поезда: " + String.format("%02d:%02d", arrivalHour, arrivalMinute))

}