package org.example.Lesson_16

import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val circle = Circle(14.0)
    println(circle.perimeter().toInt())
    println(circle.square().toInt())
}

class Circle(private val radius: Double) {
    fun square() = radius * PI.pow(2)
    fun perimeter() = radius * 2 * PI
}