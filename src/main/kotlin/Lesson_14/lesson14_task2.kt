package org.example.Lesson_14

fun main() {
    val liner = Liner1()
    val cargoShip = CargoShip1()
    val icebreaker = Icebreaker1()

    liner.printInfo()
    cargoShip.printInfo()
    icebreaker.printInfo()

}

open class Liner1 {
    open val maxSpeed = 30
    open val carryingCapacity = 10000
    open val passengerCapacity = 3000

    fun printInfo() {
        println("Информация о корабле: Максимальная скорость - $maxSpeed / Грузовместимость: $carryingCapacity / Пассажировместимость: $passengerCapacity")
    }

    open fun loadShip() {
        println("выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip1 : Liner1() {
    override val maxSpeed = 10
    override val carryingCapacity = 30000
    override val passengerCapacity = 30

    override fun loadShip() {
        println("активирует погрузочный кран")
    }
}

class Icebreaker1 : Liner1() {
    override val maxSpeed = 5
    override val carryingCapacity = 10000
    override val passengerCapacity = 20

    fun chopIce() {
        println("Ледокол колит лед")
    }

    override fun loadShip() {
        println("открывает ворота со стороны кормы")
    }
}