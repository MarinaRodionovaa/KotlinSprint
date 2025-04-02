package org.example.Lesson_17

//Задача 4 к Уроку 17
//Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
//Опиши класс посылки с такими вводными:
//- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
//- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.
//Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика. При реализации использовать сеттер.

fun main() {
    val parcel = Parcel(123, "Moscow")
    println(parcel.counter)
    parcel.location = "Podolsk"
    println(parcel.counter)
}

class Parcel(number: Int, location: String) {
    var counter: Int = 0
    var location: String = location
        set(value) {
            field = value
            counter++
        }
}