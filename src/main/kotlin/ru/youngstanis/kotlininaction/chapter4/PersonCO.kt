package ru.youngstanis.kotlininaction.chapter4

class PersonCO(val name: String) {
    companion object Loader{
        fun newPersonFromJSON(personJSON: String): PersonCO {
            val parsedName = personJSON
                .substringAfter("\"name\"")
                .substringAfter(":")
                .substringAfter("\"")
                .substringBefore("\"")
            return PersonCO(parsedName)
        }
    }
}

fun main() {
    val personJSON = """
        | Person 
        | {
        | "name": "Younger"
        | }
    """.trimMargin()
    val person = PersonCO.Loader.newPersonFromJSON(personJSON)
    println(person.name)
}
