package org.example.Lesson4

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
                    (!isShipDamaged && (countOfСrew >= 55 && countOfСrew <= 70) && countOfСargoInShip > 50) ||
                            (isShipDamaged && countOfСrew == 70 && isWhetherGood && countOfСargoInShip > 50)
                }"

    )

}