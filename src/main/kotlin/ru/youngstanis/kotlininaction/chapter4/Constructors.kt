package ru.youngstanis.kotlininaction.chapter4

open class View {
    constructor(review: Int) {
        println("Review is $review degree")
    }

    constructor(review: Int, objects: List<String>) {
        println("Review is $review degree and this objects $objects")
    }
}

class Vision: View {
    constructor(review: Int): super(review)
    constructor(objects: List<String>): this(360, objects)
    constructor(review: Int, objects: List<String>): super(review, objects)
}
