package org.example.Lesson_1_10.Lesson4

const val COUNT_OF_CREW_FROM = 55
const val COUNT_OF_CREW_UP = 70
const val COUNT_OF_CARGO_FROM = 50

fun main() {
    println("Введите данные")
    println("Корабль поврежден? True / False")
    val isShipDamaged = readLine()?.toBoolean() ?: false

    println("Кол-во экипажа на борту")
    val countOfСrew = readLine()?.toIntOrNull() ?: 0

    println("Кол-во ящиков провизии на борту")
    val countOfСargoInShip = readLine()?.toIntOrNull() ?: 0

    println("Погода благоприятна? True / False")
    val isWhetherGood = readLine()?.toBoolean() ?: false

    println(
        "Корабль может отправиться в плавание? " +
                "${
                    (!isShipDamaged && (countOfСrew >= COUNT_OF_CREW_FROM && countOfСrew <= COUNT_OF_CREW_UP) 
                            && countOfСargoInShip > COUNT_OF_CARGO_FROM) ||
                            (isShipDamaged && countOfСrew == COUNT_OF_CREW_UP && isWhetherGood && countOfСargoInShip > COUNT_OF_CARGO_FROM)
                }"

    )

}