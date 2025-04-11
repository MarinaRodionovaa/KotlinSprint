package org.example.Lesson_20

fun main() {
    val heal: (it: Gamer1) -> Unit = { it.currentHealth = it.maxHealth }

    val gamer = Gamer1("Marina", 50)
    gamer.printInfo()
    heal(gamer)
    gamer.printInfo()
}

class Gamer1(name: String, var currentHealth: Int) {
    val maxHealth: Int = 100
    val printInfo = { println("Имя: $name, Текущее здоровье: $currentHealth, Максимальное здоровье: $maxHealth") }
}