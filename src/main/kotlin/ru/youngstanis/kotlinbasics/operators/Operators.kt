package ru.youngstanis.kotlinbasics.operators

fun main(args: Array<String>) {

    println(
        """
        - Lesson 4
        |-- Logic and comparison operators 

    """.trimIndent()
    )

    val a = 1 + 1
    val b = a == 1

    println(a)
    println("${b}\n")

    // <, >, <=, >=, !=, ==
    // true
    // false

    val currentGrade = "Middle"
    val comparisonResult = templateGrade == currentGrade

    println("""
        - Are you middle backend dev?
        - ${if(comparisonResult == true) "Yes, I'm middle" else "No, I'm ${currentGrade}"}
    """.trimIndent())

    // &&, ||, !

    val c = false
    val d = !c

    println(d)

    val age = 22

    // val result = (currentGrade == "Middle" || currentGrade == "Senior") || (age >= 27 && age <= 70)
    // val result = (currentGrade == "Middle" || currentGrade == "Senior") or (age >= 27 && age <= 70)
    val result = (currentGrade == "Middle" || currentGrade == "Senior") and (age in 22..70)
    println("- Can you be a lead? $result")

    val programmerRange = age in 15..75
    println()
    println(programmerRange)

}

const val templateGrade: String = "Middle"