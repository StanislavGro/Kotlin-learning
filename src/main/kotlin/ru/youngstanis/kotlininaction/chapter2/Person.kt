package ru.youngstanis.kotlininaction.chapter2

class Person(
    val name: String,
    var isMarried: Boolean = false,
    val salary: Int = 0
)

fun main() {
    val person = Person("Kirill", false)
    println(person.name)
    println(person.isMarried)
}
