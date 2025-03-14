package org.example.Lesson2

const val MAX_PERCENT = 100

fun Int.pow(years: Int, deposit: Double, depositPercent: Double): Double {
    var depositFinal = deposit
    repeat(years) { depositFinal += depositFinal * (depositPercent / MAX_PERCENT) }
    return depositFinal
}

fun main() {
    var depositFinal: Double= 1.pow(20, 70000.0, 16.7)

    println("Размер вклада через 20 лет: ${String.format("%.3f",depositFinal )}")

}

