package ru.youngstanis.poligon

fun main() {
    val regex = """a([bc]+)d?""".toRegex()

    // Обычные проверки на совпадения
    println(regex.containsMatchIn("xabcdy"))
    println(regex.matches("xabcdy")) // не вся строка соответствует
    println(regex.matches("abcd")) // соответствует вся строка
    println(regex matches "xabcdy")     // своеобразная инфиксная запись

    // Получение совпадающей части
    val matchResult = regex.matchEntire("abbccdbbd") // сопоставление всей строки
    val matchResult2 = regex.find("abcdabbd") // находим первое совпадение
    val matchResult3 = regex.findAll("abcb abbd") // находит все совпадающие строки
    // Вместо этого, если совпадение не удалось, эти методы возвращают null или пустой Set в случае findAll

    // Операции с найденными совпадающими частями (группами)
    println(matchResult?.groupValues)
    println(matchResult2?.groupValues)
    matchResult3.forEach {
        println(it.groupValues)
    }

    // Мы также можем деструктурировать экземпляры MatchResult в операторе присваивания:
    val regex2 = """([\w\s]+) is (\d+) years old""".toRegex()
    val matchResult4 = regex2.find("Mickey Mouse is 95 years old")
    val (name, age) = matchResult4!!.destructured

    println(name)
    println(age)

    val regex3 = """(red|green|blue)""".toRegex()
    val beautiful = "Roses are red, Violets are blue"
    val grim = regex3.replace(beautiful, "dark")
    println(grim)
    val shiny = regex3.replaceFirst(beautiful, "rainbow")
    println(shiny)
}
