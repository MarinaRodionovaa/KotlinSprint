package org.example.Lesson_22

fun main() {

    val student = Student("Bob", 22, 3.4)
    val (name, age, averageMark) = student
    println("$name, $age, $averageMark")

}

data class Student(val name: String, val age: Int, val averageMark: Double)