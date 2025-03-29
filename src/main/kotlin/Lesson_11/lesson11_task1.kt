package org.example.Lesson11

fun main() {
    val user1 = User(1, "admin", "admin", "admin@gmail.com")
    val user2 = User(2, "user", "1234", "user@gmail.com")

    println("${user1.userId} , ${user1.login}, ${user1.password}, ${user1.email}")
    println("${user2.userId} , ${user2.login}, ${user2.password}, ${user2.email}")
}

class User(val userId: Int, val login: String, val password: String, val email: String) {

}