package org.example.Lesson2

const val MAX_PERCENT = 100

fun main() {
    val deposit = 70000.0
    val depositPercent = 16.7
    val depositPeriodYears = 20
    var depositFinal: Double = deposit

    for (i in 1..depositPeriodYears) {

        depositFinal += depositFinal * (depositPercent / MAX_PERCENT)

    }
    println("Размер вклада через 20 лет: ${String.format("%.3f", depositFinal)}")

}