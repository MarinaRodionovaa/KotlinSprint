package org.example.Lesson_1_10.Lesson5

const val STUB_NULL = 0.0

fun main() {
    println("Введите следующие данные")
    println("Расстояние поездки (в километрах)")
    val travelDistance = readln().toDoubleOrNull() ?: STUB_NULL

    println("Расход топлива на 100 км (в литрах)")
    val fuelСonsumption = (readln().toDoubleOrNull() ?: STUB_NULL)

    println("Текущую цену за литр топлива")
    val fuelPriceForL = (readln().toDoubleOrNull() ?: STUB_NULL)

    val totalFuel = (travelDistance * fuelСonsumption) / 100
    val totalFuelPrice = totalFuel * fuelPriceForL

    println(
        "Необходимое кол-во топлива ${String.format("%.2f", totalFuel)}\nИтоговая стоимость: ${
            String.format(
                "%.2f",
                totalFuelPrice
            )
        }"
    )

}