package org.example.Lesson5

const val FROM_NORMAL_BMI = 18.5
const val UP_NORMAL_BMI = 25.0
const val UP_EXTRA_BMI = 30.0

fun main() {
    println("Введите вес (кг)")
    val userWeight = readLine()?.toDoubleOrNull() ?: -1.0

    println("Введите вес (см)")
    val userHeight = (readLine()?.toDoubleOrNull() ?: -1.0) / 100

    val userImt = userWeight / (userHeight * userHeight)
    val result = when {
        userImt < FROM_NORMAL_BMI -> "Недостаточная масса тела"
        userImt in FROM_NORMAL_BMI..<UP_NORMAL_BMI -> "Нормальная масса тела"
        userImt in UP_NORMAL_BMI..<UP_EXTRA_BMI -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(result)
}