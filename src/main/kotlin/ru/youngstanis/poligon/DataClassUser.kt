package ru.youngstanis.poligon

import org.junit.jupiter.api.Assertions.*



data class DataClassUser(
    val name:String,
    val age: Int = 0
)

data class DataClassArticle(
    val title: String,
    val author: String
) {
    constructor() : this ("", "")
    // constructor(title: String, author: String) : this (title, author)
}

fun main() {
    val user1 = DataClassUser("Stas", 23)
    val userCopy = user1.copy(name = "Aleksandr")
    println(userCopy)

    val article = DataClassArticle()
}
