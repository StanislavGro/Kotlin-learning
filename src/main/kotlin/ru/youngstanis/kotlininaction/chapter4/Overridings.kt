package ru.youngstanis.kotlininaction.chapter4

open class Human(
    val age: Int = 0
)

class Client(
    val name: String,
    val postalCode: Int,
    val _age: Int
): Human(_age) {

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client) {
            return false
        }
        return this.name == other.name
            && this.postalCode == other.postalCode
            && this.age == other.age
    }

    override fun toString(): String = "Client(name = $name, postalCode = $postalCode)"

    override fun hashCode(): Int = name.hashCode() * 31 + age + postalCode
}

fun main(args: Array<String>) {
    val client1 = Client("Stas", 630061, 23)
    val client2 = Client("Stas", 630061, 23)
    val client3 = Client("Kolya", 234654, 27)

    println(client3.toString())
    println(client1 == client2)
    println(client3 == client2)
}
