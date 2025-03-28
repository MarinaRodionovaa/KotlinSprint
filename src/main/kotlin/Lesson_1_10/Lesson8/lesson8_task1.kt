package org.example.Lesson_1_10.Lesson8

const val DAYS_IN_WEEK = 7

fun main() {
    val viewsRange = 100..1000
    val viewsInWeek: Array<Int> = Array(DAYS_IN_WEEK, { viewsRange.random() })
    println("Сумма просмотров за неделю ${viewsInWeek.sum()}")
}