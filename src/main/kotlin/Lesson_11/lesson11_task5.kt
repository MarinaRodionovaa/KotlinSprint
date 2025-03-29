package org.example.Lesson11

var maxId = 0

fun main() {
    val firstForum = Forum()


    firstForum.createNewUser("Иван")
    firstForum.createNewUser("Oleh")

    firstForum.createNewMessage(1, "Всем привет!")
    firstForum.createNewMessage(1, "Кто нибудь тут есть?")
    firstForum.createNewMessage(2, "Продам гараж")
    firstForum.createNewMessage(2, "Всем пока!")
    firstForum.printThread()


}

class Forum() {
    var userList: MutableList<User4> = mutableListOf()
    var forumMessages: MutableList<Message> = mutableListOf()


    fun createNewUser(name: String): User4 {
        val forumUser = User4.Builder()
            .userId()
            .userName(name)
            .build()
        this.userList.add(forumUser)
        return forumUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        val author = userList.find { it.printUserId() == authorId }
        if (author != null) {
            val forumMessage = Message.Builder()
                .authorId(author)
                .message(message)
                .build()
            this.forumMessages.add(forumMessage)
        } else {
            println("Данного пользователя нет на форуме")
        }

    }

    fun printThread() {
        for (i in forumMessages) {
            i.printMessage()
        }
    }

}

class User4 private constructor(
    private var userId: Int = 0,
    private var userName: String = ""
) {
    fun printAuthor(): String {
        return this.userName
    }

    fun printUserId(): Int {
        return this.userId
    }


    class Builder {
        private var userId: Int = 0
        private var userName: String = ""

        fun generateUserId(): Int {
            maxId += 1

            return maxId
        }

        fun userId() = apply { this.userId = generateUserId() }
        fun userName(name: String) = apply { this.userName = name }
        fun build(): User4 {
            return User4(
                userId = userId,
                userName = userName
            )
        }

    }
}

class Message private constructor(
    private var authorId: User4,
    private var message: String
) {
    fun printMessage() {
        println("${authorId.printAuthor()}: $message")
    }

    class Builder {
        private var authorId: User4? = null
        private var message: String = ""
        fun authorId(authorId: User4) = apply { this.authorId = authorId }
        fun message(message: String) = apply { this.message = message }
        fun build(): Message {
            val safeAuthor = authorId
                ?: throw IllegalStateException("AuthorId must be set")

            return Message(
                authorId = safeAuthor,
                message = message
            )

        }


    }

}