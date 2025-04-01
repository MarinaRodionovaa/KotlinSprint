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

    truck.uploadPassengers()
    truck.uploadCargo()
    car.uploadPassengers()
    car1.uploadPassengers()

}


interface MoveAble {
    fun move() {
        println("Едет")
    }
}

interface PassengerTransportationAble {
    var countOfPassengers: Int
    val maxCountOfPassengers: Int

    fun loadPassengers(passengers: Int)
    fun uploadPassengers()

}

interface TruckingAble {
    var countOfCargo: Int
    val maxCountOfCargo: Int
    fun loadCargo(cargo: Int)
    fun uploadCargo()
}

class CargoTruck() : MoveAble, PassengerTransportationAble, TruckingAble {
    override var countOfPassengers: Int = 0
    override var countOfCargo: Int = 0
    override val maxCountOfPassengers: Int = 1
    override val maxCountOfCargo: Int = 2

    override fun loadPassengers(passengers: Int) {
        if (countOfPassengers + passengers > maxCountOfPassengers) {
            println("Перегруз")
        } else {
            countOfPassengers += passengers
            println("$countOfPassengers пассажиров загружено")
        }
    }

    override fun uploadPassengers() {
        println("$countOfPassengers пассажиров выгружено")
        countOfPassengers = 0

    }

    override fun loadCargo(cargo: Int) {
        if (countOfCargo + cargo > maxCountOfCargo) {
            println("Перегруз")
        } else {
            countOfCargo += cargo
            println("$countOfCargo тонн груза загружено")
        }
    }

    override fun uploadCargo() {
        println("$countOfCargo тонн груза выгружено")
        countOfCargo = 0

    }
}

class Car() : MoveAble, PassengerTransportationAble {
    override var countOfPassengers: Int = 0
    override val maxCountOfPassengers: Int = 3

    override fun loadPassengers(passengers: Int) {
        if (countOfPassengers + passengers > maxCountOfPassengers) {
            println("Перегруз")
        } else {
            countOfPassengers += passengers
            println("$countOfPassengers пассажиров загружено")
        }
    }

    override fun uploadPassengers() {
        println("$countOfPassengers пассажиров выгружено")
        countOfPassengers = 0

    }
}