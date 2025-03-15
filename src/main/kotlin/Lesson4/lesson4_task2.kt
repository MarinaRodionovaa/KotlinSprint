package org.example.Lesson4

fun main() {

    var checkedWeight = 20
    var checkedVolume = 0

    checkCargo(checkedWeight, checkedVolume)

    checkedWeight = 50
    checkedVolume = 80

    checkCargo(checkedWeight, checkedVolume)

    checkedWeight = 0
    checkedVolume = 100

    checkCargo(checkedWeight, checkedVolume)
}

fun checkCargo(checkedWeight: Int, checkedVolume: Int) {
    val weightFrom = 35
    val weightUp = 100
    val volumeUp = 100

    return println(
        "Груз с весом $checkedWeight кг и объемом $checkedVolume л соответствует категории 'Average':" +
                " ${weightFrom < checkedWeight && checkedWeight <= weightUp && checkedVolume < volumeUp}"
    )

}