package org.example.Lesson_21

fun main() {
    val gamer = Gamer("Marina", 40)
    gamer.printInfo()
    println(gamer.isHealthy())


}

fun Gamer.isHealthy(): Boolean {
    return (currentHealth == maxHealth)
}

class Gamer(name: String, var currentHealth: Int) {
    val maxHealth: Int = 100
    val printInfo = { println("Имя: $name, Текущее здоровье: $currentHealth, Максимальное здоровье: $maxHealth") }
}