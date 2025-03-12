package org.example.Lesson2

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39
    val minutesInWay: Int = 457

    val arrivalMinute: Int = (departureMinute + (minutesInWay % 60)) % 60
    val arrivalHour: Int = departureHour + minutesInWay / 60 + (departureMinute + (minutesInWay % 60)) / 60

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute  ")

}