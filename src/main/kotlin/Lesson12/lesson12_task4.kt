package org.example.Lesson12

fun main() {

    val day1 = WhetherOnDay3(280, 300, false)

    val day2 = WhetherOnDay3(500, 350, true)

}

class WhetherOnDay3(_dayDegree: Int, _nightDegree: Int, _isRaining: Boolean) {
    val dayDegree: Int = _dayDegree - 273
    val nightDegree: Int = _nightDegree - 273
    val isRaining: Boolean = _isRaining

    fun printInfo() {
        println("Температура днем $dayDegree\nТемпература ночью $nightDegree\nНаличие дождя $isRaining")
    }

    init {
        printInfo()
    }

}