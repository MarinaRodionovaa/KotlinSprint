package org.example.Lesson_17

fun main() {
    val ship = Ship("Ship")
    ship.name = "new name"
    println(ship.name)
}

class Ship(name: String) {
    var name: String = name
        set(value) {
            println("Имя корабля изменить нельзя")
        }

    val averageSpeed = 20
    val homePort = ""
}

