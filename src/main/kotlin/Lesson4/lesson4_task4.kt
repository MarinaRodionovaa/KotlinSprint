package org.example.Lesson4

fun main() {
    val dayOfExercises = 5
    val evenDay = dayOfExercises % 2 == 0
    val armAndAbsDay = !evenDay
    val LegAndBackDay = evenDay

    println(
        "Упражнения для рук: $armAndAbsDay\n" +
                "Упражнения для ног: $LegAndBackDay\n" +
                "Упражнения для спины: $LegAndBackDay\n" +
                "Упражнения для пресса: $armAndAbsDay\n"
    )
}