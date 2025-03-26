package org.example.Lesson12
const val DAYS_IN_MONTH = 30

fun main() {

    val whetherMonth: MutableList<WhetherOnDay4> = mutableListOf()

    for (i in 1..DAYS_IN_MONTH) {
        val range = 273..300
        val rangeRain = listOf(true, false)
        whetherMonth.add(WhetherOnDay4(range.random(), range.random(), rangeRain.random()))
    }
    val dayTemperature = whetherMonth.map { it.dayDegree }
    val nightTemperature = whetherMonth.map { it.nightDegree }
    val rainDays: Int = whetherMonth.count { it.isRaining }


    println(
        "Средняя температура днем: ${dayTemperature.average().toInt()},\n" +
                "Средняя температура ночью: ${nightTemperature.average().toInt()},\n" +
                "Кол-во дождливых дней $rainDays"
    )
}

class WhetherOnDay4(_dayDegree: Int, _nightDegree: Int, _isRaining: Boolean) {
    val dayDegree: Int = _dayDegree - 273
    val nightDegree: Int = _nightDegree - 273
    val isRaining: Boolean = _isRaining

    fun printInfo() {
        println("Температура днем $dayDegree\nТемпература ночью $nightDegree\nНаличие дождя $isRaining")
    }

}

