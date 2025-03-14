package org.example.Lesson4

fun main() {

    val isWhetherTodaySunny = true
    val isTentTodayOpen = true
    val airHumidityTodayPercent = 20
    val seasonNow = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${isWhetherTodaySunny == true && isTentTodayOpen == true && airHumidityTodayPercent == 20 && seasonNow != "зима"}"
    )

}