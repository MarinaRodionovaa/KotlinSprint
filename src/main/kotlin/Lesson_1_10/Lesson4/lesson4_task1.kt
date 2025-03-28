package org.example.Lesson_1_10.Lesson4

const val COUNT_TABLES = 13

fun main() {

    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${bookedTablesToday < COUNT_TABLES}\nДоступность столиков на завтра: ${bookedTablesTomorrow < COUNT_TABLES}")

}