package org.example.Lesson4

const val WEIGHT_FROM = 35
const val WEIGHT_UP = 100
const val VOLUME_UP = 100

fun main() {

    var checkedWeight = 20
    var checkedVolume = 80

    println(
        "Груз с весом $checkedWeight кг и объемом $checkedVolume л соответствует категории 'Average':" +
                " ${WEIGHT_FROM < checkedWeight && checkedWeight <= WEIGHT_UP && checkedVolume < VOLUME_UP}"
    )

    checkedWeight = 50
    checkedVolume = 100

    println(
        "Груз с весом $checkedWeight кг и объемом $checkedVolume л соответствует категории 'Average':" +
                " ${WEIGHT_FROM < checkedWeight && checkedWeight <= WEIGHT_UP && checkedVolume < VOLUME_UP}"
    )

}