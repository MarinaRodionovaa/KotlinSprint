package org.example.Lesson4

fun main() {
    val dayOfExercises = 5

    println(
        "Упражнения для рук: ${dayOfExercises % 2 != 0}\n" +
                "Упражнения для ног: ${dayOfExercises % 2 == 0}\n" +
                "Упражнения для спины: ${dayOfExercises % 2 == 0}\n" +
                "Упражнения для пресса: ${dayOfExercises % 2 != 0}\n"
    )
}