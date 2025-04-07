package org.example.Lesson_18

//Задача 5* к Уроку 18
//В приложении есть экран, на котором можно рисовать различные фигуры, указывая координаты (x, y).
//Фигурами могут быть круг, квадрат и точка. Координаты могут быть представлены типами данных Int и Float.
//
//Создайте класс Screen, который будет содержать методы draw для рисования каждой фигуры с координатами типов Int и Float.
//Каждый метод должен возвращать строку, указывающую, какая фигура нарисована и в каких координатах.
//Используйте перегрузку методов для реализации.

class Screen() {
    fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Нарисован круг с координатами x = $x, y = $y , радиус = $radius")

    }

    fun drawCircle(x: Float, y: Float, radius: Float) {
        println("Нарисован круг с координатами x = $x, y = $y , радиус = $radius")

    }

    fun drawSquare(x: Int, y: Int, height: Int) {
        println("Нарисован квадрат с координатами x = $x, y = $y , стороны = $height")

    }

    fun drawSquare(x: Float, y: Float, height: Float) {
        println("Нарисован квадрат с координатами x = $x, y = $y , стороны = $height")
    }

    fun drawPoint(x: Int, y: Int) {
        println("Нарисована точка с координатами x = $x, y = $y")

    }

    fun drawPoint(x: Float, y: Float) {
        println("Нарисована точка с координатами x = $x, y = $y")

    }
}