package ru.youngstanis.poligon

fun main(args: Array<String>) {
    testRegEx()
}

fun testRegEx() {
    val regexOne = Regex("""a[bc]+d?""")
    val regexTwo = """a([bc]+)d?""".toRegex()
    val regexThree = Regex.fromLiteral("""a[bc]+d?""")

    // println(containsMatchIn(regexTwo, "xabcdy"))
    // println(matchEntire(regexOne, "abbccbbd")?.value)
    println(regexTwo.find("abcb abbd")?.groups)
}

fun containsMatchIn(regex: Regex, string: String): Boolean = regex.containsMatchIn(string)

fun matches(regex: Regex, string: String): Boolean = regex.matches(string)

fun matches2(regex: Regex, string: String): Boolean = regex matches string

fun matchEntire(regex: Regex, string: String): MatchResult? = regex.matchEntire(string)

fun find(regex: Regex, string: String):MatchResult? = regex.find(string)

fun findAll(regex: Regex, string: String):Sequence<MatchResult> = regex.findAll(string)