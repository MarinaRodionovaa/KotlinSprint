package org.example.Lesson2

import kotlin.math.pow

const val MAX_PERCENT = 100

fun main() {

    val deposit = 70000.0
    val depositPercent = 16.7
    val depositPeriodYears = 20

    var depositFinal = deposit * (1 + depositPercent / MAX_PERCENT).pow(depositPeriodYears)

    println("Размер вклада через 20 лет: ${String.format("%.3f", depositFinal)}")

}

