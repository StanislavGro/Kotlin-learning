package ru.youngstanis.kotlininaction.chapter2.geometry

fun main(args: Array<String>) {
    for(i in 0..100) {
        val rectangle = createRandomRectangle()
        println(if(rectangle.isSquare) "[${rectangle.height}, ${rectangle.width}]" else rectangle.isSquare)
    }
}
