package org.example.Lesson_1_10.Lesson4

fun main() {
    val dayOfExercises = 5
    val evenDay = dayOfExercises % 2 == 0
    val armAndAbsDay = !evenDay
    val legAndBackDay = evenDay

    println(
        "Упражнения для рук: $armAndAbsDay\n" +
                "Упражнения для ног: $legAndBackDay\n" +
                "Упражнения для спины: $legAndBackDay\n" +
                "Упражнения для пресса: $armAndAbsDay\n"
    )
}