package ru.youngstanis.kotlinbasics.interpolation

fun main() {
    println("Lesson 3 Interpolation, string, concatenation")

    val greeting = "Приветсвую"
    val space = " "
    val userName = "Станислав"

    println(greeting + "," + space + userName + "!")


    // Интерполяция строк (так выглядит более изящно и без нагромождения кавычек и плюсов)
    println("$greeting, $userName! Еще раз, но уже более изящно)")
    println("Чтобы сложить числа внутри строки нужно сделать так: ${15 + 81}")

    // Многострочные шаблоны

    // Трим интенд найдет самую левую надпись и будет относительно нее форматировать всю мультистроку
    val multilineTrimIndentTemplates = """
        Это первая строка
            Вторая
                    Ну а эта пусть будет третья
    """.trimIndent()

    println(multilineTrimIndentTemplates)

    val multilineWithoutTrimIndentTemplates2 = """
        Это первая строка
            Вторая
                    Ну а эта пусть будет третья
    """

    println(multilineWithoutTrimIndentTemplates2)

    // Все кадрирует относительно начала (|)
    // | говорит о том, где начало, а потом все помещает с крайнего левого края
    val multilineTrimMarginTemplates = """
        |Это первая строка
         |      Вторая
                    |Ну а эта пусть будет третья
    """.trimMargin()

    println(multilineTrimMarginTemplates)

    println("svd" + 1)

}