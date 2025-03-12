package org.example.Lesson2

const val PERCENT_BUFF = 20
const val PERCENT_MAX = 100

fun main() {

    val crystalMined = 7.0f
    val ironMined = 11.0f

    val bonusCrystalMined: Int = (crystalMined / PERCENT_MAX * PERCENT_BUFF).toInt()
    val bonusIronMined: Int = (ironMined / PERCENT_MAX * PERCENT_BUFF).toInt()

    println("Добыто бонусной кристальной руды: $bonusCrystalMined")
    println("Добыто бонусной железной руды: $bonusIronMined")

}