package org.example.Lesson_17

fun main() {
    val folder = Folder("folder", 12)
    println("Имя папки: ${folder.name}\nКол-во файлов ${folder.countOfFiles}")
    folder.isSecret = true
    println()
    println("Имя папки: ${folder.name}\nКол-во файлов ${folder.countOfFiles}")
}

class Folder(name: String, countOfFiles: Int) {
    val name: String = name
        get() {
            if (isSecret) {
                return "скрытая папка"
            } else {
                return field
            }
        }
    val countOfFiles: Int = countOfFiles
        get() {
            if (isSecret) {
                return 0
            } else {
                return field
            }
        }
    var isSecret: Boolean = false

}