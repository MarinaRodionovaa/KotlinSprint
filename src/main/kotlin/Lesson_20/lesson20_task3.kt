package org.example.Lesson_20

fun main() {
    val gamer = Gamer()
    val checkKey: (gamer: Gamer) -> String = { if (gamer.key) "Игрок открыл дверь" else "Дверь заперта" }
    println(checkKey(gamer))
    gamer.key = true
    println(checkKey(gamer))

}

class Gamer() {
    var key = false
}