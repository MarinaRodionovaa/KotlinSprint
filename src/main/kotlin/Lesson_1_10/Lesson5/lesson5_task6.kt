package org.example.Lesson_1_10.Lesson5

const val FROM_NORMAL_BMI = 18.5
const val UP_NORMAL_BMI = 25.0
const val UP_EXTRA_BMI = 30.0
const val CM_TO_METERS = 100

const val STUB_FOR_NULL = -1.0

fun main() {
    println("Введите вес (кг)")
    val userWeight = readln().toDoubleOrNull() ?: STUB_FOR_NULL

    println("Введите вес (см)")
    val userHeight = (readln().toDoubleOrNull() ?: STUB_FOR_NULL) / CM_TO_METERS

    val userImt = userWeight / (userHeight * userHeight)
    val result = when {
        userImt < FROM_NORMAL_BMI -> "Недостаточная масса тела"
        userImt in FROM_NORMAL_BMI..<UP_NORMAL_BMI -> "Нормальная масса тела"
        userImt in UP_NORMAL_BMI..<UP_EXTRA_BMI -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ: ${String.format("%.2f", userImt)} - $result")
}