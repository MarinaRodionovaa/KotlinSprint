package org.example.Lesson_18

import kotlin.math.pow

//Задача 4 к Уроку 18
//
//В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
//Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.
//Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой. Если посылка – куб, то только с длиной ребра.

fun main() {
    val box1 = Box().addNewBox(34.0)
    val box2 = Box().addNewBox(33.0, 54.0, 88.0)

    println(box1.calculateArea())
    println(box2.calculateArea())
}

open class Box() {

    fun addNewBox(length: Double, width: Double, height: Double): RectangularBox {
        val rectangularBox = RectangularBox(length, width, height)
        return rectangularBox
    }

    fun addNewBox(ribLength: Double): CubeBox {
        val cubeBox = CubeBox(ribLength)
        return cubeBox
    }
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    fun calculateArea() = 2 * (width * height + length * width + length * height)

}

class CubeBox(private val ribLength: Double) : Box() {
    fun calculateArea() = 6 * ribLength.pow(2)
}