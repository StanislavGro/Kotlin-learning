package ru.youngstanis.kotlininaction.chapter4

class LengthCounter {
    // Если мы хотим получить свойство, то оно должно быть как-то инициализировано,
    // либо через гет,
    // либо через поле
    // если юзаем field в get или в set то точно должно быть инициализировано, даже если get есть
    var counter: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var _counter: Int = 0
        private set

    fun addWord(word: String) {
        _counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hello, World!!")
    println(lengthCounter._counter)
}
