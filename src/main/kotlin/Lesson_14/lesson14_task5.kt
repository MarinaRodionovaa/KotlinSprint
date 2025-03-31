package org.example.Lesson_14

fun main() {
    val chat = Chat()
    chat.addMessage("Alex", "Hello world!")
    chat.addThreadMessage("Alexandr", "Merhaba!", 1)
    chat.addMessage("kolyan", "privet")
    chat.addThreadMessage("Joy", "Hola", 3)
    chat.addMessage("Lin", "Xin Chao!")
    chat.printChat()
}

class Chat() {
    var messageMaxId = 0
    var messages: MutableList<Message> = mutableListOf()

    fun printChat() {
        val grouped = messages.groupBy { message ->
            if (message is ChildMessage) message.parentMessageId else message.id
        }

        grouped.forEach {
            it.value.forEach {
                val space = if (it is ChildMessage) "    " else ""
                println(space + "${it.author} - ${it.text}")

            }
        }
    }

    fun generateMessageId(): Int {
        messageMaxId += 1
        return messageMaxId
    }


    fun addMessage(author: String, text: String) {
        messages.add(Message(generateMessageId(), text, author))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        messages.add(ChildMessage(generateMessageId(), text, author, parentMessageId))
    }

}

open class Message(
    val id: Int,
    val text: String,
    val author: String
)

class ChildMessage(
    messageId: Int,
    text: String,
    author: String,
    val parentMessageId: Int,
) : Message(messageId, text, author)