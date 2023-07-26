package ru.youngstanis.kotlininaction.chapter5

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(
        Person(age = 15, name = "hjds"),
        Person(age = 8, name = "sdvsdvsd"),
        Person(age = 64, name = "svdsvsd"),
        Person(age = 34,name = ",mn"),
        Person(age = 28,name = "yutktwe"),
        Person(age = 75,name = "fgnfn"),
        Person(age = 72,name = "ey5rey"),
        Person(age = 92,name = "tehr"),
        Person(age = 2, name = "dfger"),
        Person(age = 3, name = "bcvbb")
    )
    println(findOldestPerson(people))
    println(findOldestPersonWithLambda(people))
    println(findOldestPersonWithLambda2(people))
}

fun findOldestPerson(people: List<Person>): String {
    var _age = 0
    var _name = ""
    for(person in people) {
        if(person.age > _age) {
            _age = person.age
            _name = person.name
        }
    }
    return "Name: $_name, age: $_age"
}

fun findOldestPersonWithLambda(people: List<Person>): Person {
    return people.maxBy { it.age }
}

fun findOldestPersonWithLambda2(people: List<Person>): Person {
    return people.maxBy(Person::age)
}
