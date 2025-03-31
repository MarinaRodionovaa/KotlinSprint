package org.example.Lesson_15

fun main() {
    val truck = CargoTruck()
    val car = Car()
    val car1 = Car()

    truck.loadPassengers(1)
    truck.loadCargo(2)
    truck.move()

    car.loadPassengers(3)
    car.move()

    car1.loadPassengers(2)
    car1.move()

}


interface MoveAble {
    fun move() {
        println("Едет")
    }
}

interface PassengerTransportationAble {
    var countOfPassengers: Int
    val maxCountOfPassengers: Int


    fun loadPassengers(passengers: Int) {
        if (countOfPassengers + passengers > maxCountOfPassengers) {
            println("Перегруз")
        } else {
            countOfPassengers += passengers
            println("$countOfPassengers пассажиров загружено")
        }
    }
}

interface TruckingAble {
    var countOfCargo: Int
    val maxCountOfCargo: Int
    fun loadCargo(cargo: Int) {
        if (countOfCargo + cargo > maxCountOfCargo) {
            println("Перегруз")
        } else {
            countOfCargo += cargo
            println("$countOfCargo тонн груза загружено")
        }
    }
}

class CargoTruck() : MoveAble, PassengerTransportationAble, TruckingAble {
    override var countOfPassengers: Int = 0
    override var countOfCargo: Int = 0
    override val maxCountOfPassengers: Int = 1
    override val maxCountOfCargo: Int = 2
}

class Car() : MoveAble, PassengerTransportationAble {
    override var countOfPassengers: Int = 0
    override val maxCountOfPassengers: Int = 3
}