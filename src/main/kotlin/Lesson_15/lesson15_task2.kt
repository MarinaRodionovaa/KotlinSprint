package org.example.Lesson_15

fun main() {
    val todayTemperature = Temperature(26)
    val todayPrecipitationAmount = PrecipitationAmount(70)

    val server = WeatherServer()
    server.sentToServer(todayTemperature)
    server.sentToServer(todayPrecipitationAmount)
}

abstract class WeatherStationStats(value: Int)

class Temperature(val value: Int) : WeatherStationStats(value)

class PrecipitationAmount(val value: Int) : WeatherStationStats(value)

class WeatherServer {
    fun sentToServer(message: WeatherStationStats) {
        if (message is Temperature) {
            println("Температура ${message.value}")
        } else if (message is PrecipitationAmount) {
            println("Осадки ${message.value}%")

        }

    }
}