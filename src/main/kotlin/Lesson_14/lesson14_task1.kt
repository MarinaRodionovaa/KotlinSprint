package org.example.Lesson_14

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

}

open class Liner {
    open val maxSpeed = 30
    open val carryingCapacity = 10000
    open val passengerCapacity = 3000
}

class CargoShip : Liner() {
    override val maxSpeed = 10
    override val carryingCapacity = 30000
    override val passengerCapacity = 30
}

class Icebreaker : Liner() {
    override val maxSpeed = 5
    override val carryingCapacity = 10000
    override val passengerCapacity = 20

    fun chopIce(){
        println("Ледокол колит лед")
    }
}