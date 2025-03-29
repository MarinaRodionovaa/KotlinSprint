package org.example.Lesson_14


fun main() {
    val planet = Planet(
        "Марс", false, true,
        sputniks = listOf(Sputnik("Фобос", false, false), Sputnik("Деймос", false, false))
    )

    println("Спутники планеты ${planet.name}: ${planet.sputniks.joinToString { it.name }}")

}

open class CelestialBody(val name: String, isAtmosphere: Boolean, isLanding: Boolean)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
    val sputniks: List<Sputnik>
) : CelestialBody(name, isAtmosphere, isLanding)

class Sputnik(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
) : CelestialBody(name, isAtmosphere, isLanding)