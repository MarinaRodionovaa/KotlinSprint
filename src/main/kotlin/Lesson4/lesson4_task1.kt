package org.example.Lesson4

fun main() {

    val countTables = 13
    var BookedTablesToday = 13
    var BookedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${BookedTablesToday < countTables}\nДоступность столиков на завтра: ${BookedTablesTomorrow < countTables}")

}