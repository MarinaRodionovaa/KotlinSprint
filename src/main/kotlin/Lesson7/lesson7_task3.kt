package org.example.Lesson7

const val STUB_NULL = -1

fun main() {
    println("Введите число")
    val rangeUp = readln().toIntOrNull() ?: STUB_NULL
    val rangeEvenNumbers = 0..rangeUp step 2
    for (i in rangeEvenNumbers) {
        println(i)
    }
}