package ru.youngstanis.kotlininaction.chapter4

open class Human(
    val age: Int = 0
)

class Client(
    val name: String,
    val postalCode: Int
): Human() {

    override fun toString(): String = "Client(name = $name, postalCode= $postalCode)"

}