package ru.youngstanis.kotlininaction.chapter4

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person(val name: String) {
    companion object: JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            val parsedName = jsonText
                .substringAfter("\"name\"")
                .substringAfter(":")
                .substringAfter("\"")
                .substringBefore("\"")
            return Person(parsedName)
        }
    }
}

fun Person.Companion.sayHello(): String {
    return "Hello"
}

fun <T> loadFromJSON(factory: JSONFactory<T>): T {
    return factory.fromJSON(
        """
        | Person 
        | {
        | "name": "Younger"
        | }
        """.trimMargin()
    )
}

fun main() {
    println(loadFromJSON(Person).name)
    println(Person.sayHello())
}
