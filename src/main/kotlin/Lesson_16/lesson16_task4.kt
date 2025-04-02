package org.example.Lesson_16

fun main() {
    val order = Order(233)
    order.requestManager("Заказ создан")
}

class Order(private val number: Int) {
    private var status = ""

    fun requestManager(newStatus: String) {
        changeStatus(newStatus)
    }

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }
}