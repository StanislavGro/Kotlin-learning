package ru.youngstanis.kotlininaction.chapter4

class User(
    val id: Long,
    val firstName: String,
    val secondName: String
) {
    val fullName: String
        get() = "$firstName $secondName"

    var isAlive: Boolean = true
        set(isAlive) {
            field = isAlive
        }
}

fun main(args: Array<String>) {

    val user = User(1L, "Stanislav", "Grokhotov")
    println(user.fullName)
    println(user.isAlive)
    user.isAlive = false
    println(user.id)
    println(user.isAlive)
}