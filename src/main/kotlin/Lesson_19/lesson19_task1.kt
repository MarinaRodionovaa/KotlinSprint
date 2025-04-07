package org.example.Lesson_19

fun main() {
    println("Вы можете добавить следующих рыб:")
    for (i in Fish.values()) {
        println(i.value)
    }

}

enum class Fish(val value: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}