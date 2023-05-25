package ru.youngstanis.kotlininaction.chapter2.cycles

fun main(args: Array<String>) {
    val range: IntRange = 1..100
    fizzBuzz(range)
}

// fun fizzbuzz(range: IntRange) {
//     for (i in range) {
//         if (i % 3 == 0 || i % 5 == 0) {
//             if (i % 3 == 0) {
//                 print("fizz")
//             }
//             if(i % 5 == 0) {
//                 print("buzz")
//             }
//             println()
//         }
//         else {
//             println(i)
//         }
//     }
// }

fun fizzBuzz(range: IntRange) {
    for (i in range) {
        when {
            i % 15 == 0 -> println("Fizz Buzz")
            i % 5 == 0 -> println("Buzz")
            i % 3 == 0 -> println("Fizz")
            else -> println(i)
        }
    }
}