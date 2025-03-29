package org.example.Lesson_14

import kotlin.math.PI

fun main() {
    val shapesList = listOf(
        Rectangle(10.0, 13.0, "Черный"),
        Rectangle(11.0, 30.0, "Белый"),
        Circle(20.0, "Черный"),
        Circle(4.0, "Белый")
    )

    var sumPerimeter = 0.0
    var sumArea = 0.0
    shapesList.forEach { if (it.color == "Черный") sumPerimeter += it.calculatePerimeter() }
    shapesList.forEach { if (it.color == "Белый") sumArea += it.calculateArea() }

    println("Cумма периметров всех черных фигур ${sumPerimeter.toInt()}\nCумма площадей всех белых фигур ${sumArea.toInt()} ")

}

abstract class Figure(val color: String) {

    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Rectangle(
    val length: Double,
    val width: Double,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Double {
        return length * width
    }

    override fun calculatePerimeter(): Double {
        return length * 2 + width * 2
    }
}

class Circle(
    val radius: Double,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * (radius * radius)
    }

    override fun calculatePerimeter(): Double {
        return PI * 2 * radius
    }
}