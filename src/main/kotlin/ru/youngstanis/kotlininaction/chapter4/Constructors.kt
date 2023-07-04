package ru.youngstanis.kotlininaction.chapter4

class User1 constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

class User2(_nickname: String) { // тут без val _nickname является полем
    val nickname: String = _nickname
}

class User3(
    val nickname: String = "Stas",
    val email: String
) // а тут nickname уже свойство, поэтому у него есть геттер

fun main() {
    val user = User3(nickname = "fv", email = "vsdv")
    val user2 = User3(nickname = "fv", "vsdv")
    val user3 = User3("fv", email = "vsdv")
    val user4 = User3("fv", "vsdv")
}
