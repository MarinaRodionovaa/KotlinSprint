package org.example.Lesson_21

fun main() {
    println(listOf(2, 4, 5, 6, 7, 8, 3).evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var evenNumbersSum = 0
    this.forEach {
        if (it % 2 == 0) {
            evenNumbersSum += it
        }
    }
    return evenNumbersSum
}