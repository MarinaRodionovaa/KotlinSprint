package org.example.Lesson12

fun main() {

    val day1 = WhetherOnDay0(35, 23, false)
    day1.printInfo()

    val day2 = WhetherOnDay0(24, 15, true)
    day2.printInfo()

}

class WhetherOnDay0(val dayDegree: Int, val nightDegree: Int, val isRaining: Boolean) {

    fun printInfo() {
        println("Температура днем $dayDegree\nТемпература ночью $nightDegree\nНаличие дождя $isRaining")
    }

}