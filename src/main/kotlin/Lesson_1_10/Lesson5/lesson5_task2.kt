package org.example.Lesson_1_10.Lesson5

import java.time.LocalDateTime

const val LEGAL_AGE = 18

fun main() {
    println("Введите ваш год рождения")
    val userYearOfBirthday = readLine()?.toIntOrNull() ?: LocalDateTime.now().year
    val currentYear = LocalDateTime.now().year

    if (currentYear - userYearOfBirthday >= LEGAL_AGE) {
        println("Показать экран со скрытым контентом")
    }
}