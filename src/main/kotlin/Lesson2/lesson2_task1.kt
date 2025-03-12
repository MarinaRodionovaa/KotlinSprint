package org.example.Lesson2

fun main() {
    val marks: List<Double> = listOf(3.0, 4.0, 3.0, 5.0)
//    val mean: Double = (3.0 + 4.0 + 3.0 + 5.0)/4 -- второй вариант решения, но думаю делать списком оптимальнее
    println("Средняя оценка в классе: " + marks.sum() / marks.count())
}