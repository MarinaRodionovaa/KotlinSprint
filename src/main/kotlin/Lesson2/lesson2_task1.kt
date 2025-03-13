package org.example.Lesson2

fun main() {
    val marks: List<Double> = listOf(3.0, 4.0, 3.0, 5.0)
    println("Средняя оценка в классе: " + marks.sum() / marks.count())
}