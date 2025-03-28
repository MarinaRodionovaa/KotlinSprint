package org.example.Lesson11

fun main() {
    val user1 = User3("admin", "avatar")
    val room1 = Room("Комната", "Первая комната")

    room1.addUser(user1)

    room1.changeStatus(user1, "пользователь заглушен")

}

class Room(image: String, roomName: String) {
    var userList = mutableListOf<User3>()

    fun addUser(user: User3) {
        userList.add(user)
    }

    fun changeStatus(user: User3, status: String) {
        userList[ userList.indexOf(user)].status = status
    }


}

class User3(val login: String, var avatar: String) {
    var status: String = "микрофон выключен"

}

