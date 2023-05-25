package ru.youngstanis.kotlininaction.chapter2

class Person(
    val  name: String,
    var isMarried: Boolean
)

fun main() {
    val person = Person("Kirill", false)
    println(person.name)
    println(person.isMarried)
}