package org.example.Lesson_19

fun main() {
    val tank = Tank()
    tank.arming(Cartridge.RED)
    tank.shoot()
}

class Tank {
    private var cartridge: Cartridge? = null

    fun arming(inputCartridge: Cartridge) {
        this.cartridge = inputCartridge
    }

    fun shoot() {
        try {
            println("Выстрел с силой удара ${cartridge!!.impactForce}")
        } catch (e: Exception) {
            println("Танк не заряжен")
        }

    }
}

enum class Cartridge(val impactForce: Int) {
    BLUE(5),
    GREEN(7),
    RED(2)
}