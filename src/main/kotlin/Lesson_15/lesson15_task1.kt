package org.example.Lesson_15

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println("Карась ${carp.swimMove()}")
    println("Чайка ${seagull.flyMove()}, ${seagull.swimMove()}")
    println("Утка  ${duck.flyMove()}, ${duck.swimMove()}")
}

interface Flyable {
    fun flyMove(): String {
        return "Летает"

    }

}

interface Swimable {
    fun swimMove(): String {
        return "Плывет"
    }
}

class Carp : Swimable
class Seagull : Flyable, Swimable
class Duck : Flyable, Swimable