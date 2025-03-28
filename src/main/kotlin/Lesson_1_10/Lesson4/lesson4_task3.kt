package org.example.Lesson_1_10.Lesson4

const val SUNNY_WHETHER = true
const val TENT_OPEN = true
const val HUMIDITY_PERCENT = 20
const val BAD_SEASON = "зима"

fun main() {

    val isWhetherTodaySunny = true
    val isTentTodayOpen = true
    val airHumidityTodayPercent = 20
    val seasonNow = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${isWhetherTodaySunny == SUNNY_WHETHER && isTentTodayOpen == TENT_OPEN && airHumidityTodayPercent == HUMIDITY_PERCENT && seasonNow != BAD_SEASON}"
    )

}