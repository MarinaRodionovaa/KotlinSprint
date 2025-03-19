package org.example.Lesson5

fun main() {
    println("Введите следующие данные")
    println("Расстояние поездки (в километрах)")
    val travelDistance = readLine()?.toDoubleOrNull() ?: 0.0

    println("Расход топлива на 100 км (в литрах)")
    val fuelСonsumption = (readLine()?.toDoubleOrNull() ?: 0.0)

    println("Текущую цену за литр топлива")
    val fuelPriceForL = (readLine()?.toDoubleOrNull() ?: 0.0)

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