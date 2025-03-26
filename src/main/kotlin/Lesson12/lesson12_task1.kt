package org.example.Lesson12

fun main() {

    val day1 = WhetherOnDay()
    day1.dayDegree = 35
    day1.nightDegree = 23

    day1.printInfo()

    val day2 = WhetherOnDay()
    day2.dayDegree = 24
    day2.nightDegree = 15
    day2.isRaining = true

    day2.printInfo()

}
class WhetherOnDay( ) {
    var dayDegree : Int = 15
    var nightDegree: Int = 9
    var isRaining:Boolean = false

    fun printInfo() {
        println("Температура днем $dayDegree\nТемпература ночью $nightDegree\nНаличие дождя $isRaining")
    }

}