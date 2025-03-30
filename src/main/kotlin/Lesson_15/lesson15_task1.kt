package org.example.Lesson_15

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println("Карась ${carp.swimMove()}")
    println("Чайка ${seagull.flyMove()}, ${seagull.swimMove()}")
    println("Утка  ${duck.flyMove()}, ${duck.swimMove()}")
}

interface FlyingAnimal {
    fun flyMove(): String {
        return "Летает"

    }

}

interface SwimmingAnimal {
    fun swimMove(): String {
        return "Плывет"
    }
}

class Carp : SwimmingAnimal
class Seagull : FlyingAnimal, SwimmingAnimal
class Duck : FlyingAnimal, SwimmingAnimal