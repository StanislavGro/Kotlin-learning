package ru.youngstanis.patterns

import ru.youngstanis.kotlininaction.chapter2.Person

// В котлине не нужно реализовывать паттерн одиночка,
//  так как он предоставляется сразу же с ключевым словом object
// У него не может быть конструктора, ни основного, ни вторичного
object Payroll {
    private val employees = arrayListOf<Person>()

    fun addEmployee(vararg person: Person) {
        employees.addAll(person)
    }

    fun getCommonSalary(): Int {
        var result = 0
        for(person in employees) {
            result += person.salary
        }
        return result
    }
}

fun main() {
    Payroll.addEmployee(
        Person("Stas", salary = 150000),
        Person("Misha", true, salary = 35000),
        Person("Sergey", salary = 80000),
        Person("Nikita", true, salary = 970000),
        Person("Roma", true, salary = 678000)
    )
    println(Payroll.getCommonSalary())
}


