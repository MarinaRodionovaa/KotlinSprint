package org.example.Lesson12

fun main() {

    val day1 = WhetherOnDay2(280, 300, false)
    day1.printInfo()

    val day2 = WhetherOnDay2(500, 350, true)
    day2.printInfo()

}

class WhetherOnDay2(_dayDegree: Int, _nightDegree: Int, _isRaining: Boolean) {
    val dayDegree: Int = _dayDegree - 273
    val nightDegree: Int = _nightDegree - 273
    val isRaining: Boolean = _isRaining

    fun printInfo() {
        println("Температура днем $dayDegree\nТемпература ночью $nightDegree\nНаличие дождя $isRaining")
    }

}