package org.example.Lesson_15

abstract class Product(val name: String, val quantity: Int)

interface Searchable {
    fun search()
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun search() {
        println("Выполняется поиск")
    }
}

class Components(name: String, quantity: Int) : Product(name, quantity)