package org.example.Lesson_16

fun main() {
    val circle = Circle(14.0)
    println(circle.perimeter().toInt())
    println(circle.square().toInt())
}

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun square() = radius * (pi * pi)
    fun perimeter() = radius * 2 * pi
}