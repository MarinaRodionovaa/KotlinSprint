package org.example.Lesson_20

fun main() {
    val heal: (it: Gamer) -> Unit = { it.currentHealth = it.maxHealth }

    val gamer = Gamer("Marina", 50)
    gamer.printInfo()
    heal(gamer)
    gamer.printInfo()
}

class Gamer(name: String, var currentHealth: Int) {
    val maxHealth: Int = 100
    val printInfo = { println("Имя: $name, Текущее здоровье: $currentHealth, Максимальное здоровье: $maxHealth") }
}