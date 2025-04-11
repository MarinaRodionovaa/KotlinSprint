package org.example.Lesson_21

fun main() {
    val skills = mapOf(
        "Charisma" to 44,
        "Comedy" to 12,
        "Cooking" to 30,
        "Fitness" to 50,
        "Gardening" to 50,
    )
    println(skills.findMax())
}

fun Map<String, Int>.findMax(): String {

    return this.filterValues { it == this.values.max() }.keys.elementAt(0)
}