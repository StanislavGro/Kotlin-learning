package ru.youngstanis.kotlininaction.chapter4

interface MyUser {

    // Можно, говорим переопределить свойство получения
    val name: String

    // Интерфейс не может хранить значения, поэтому нельзя присваивать им конкретные значения
    // val secondName: String = "fbffb"
    //     get() = field

    // Можно, реализовали свойство получения сразу
    val secondName: String
        get() = "cfds"

    // Нельзя
    // var secondName2: String
    //     get() = "cfds"

    // Можно, говорим переопределить свойство получения и присвоения
    var secondName2: String
}

class PrivateUser(
    override val name: String,
    override var secondName2: String
) : MyUser

class SubUser(val email: String) : MyUser {

    override val name: String
        get() = email.substringBefore("@")

    override var secondName2: String = "Grokhotov"
        get() = field
        set(value) {
            field = value
        }
}

class FacebookUser(val accountId: Int) : MyUser {
    override val name = getFacebookNameByAccountId(accountId)
    override var secondName2: String = "Grokhotov"
        get() = field
        set(value) {
            field = value
        }

    private fun getFacebookNameByAccountId(accountId: Int): String =
        if (accountId % 2 == 0) {
            "Stas"
        } else {
            "Misha"
        }
}

class ExUser {
    //Если мы хотим обратиться к field, то field должен быть инициализирован
    var address: String = ""
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    println(PrivateUser("Stanislav", "Grokhotov").secondName2)
    println(SubUser("Michail@mail.ru").secondName2)
    println(FacebookUser(135458).secondName2)
    println(ExUser().address)
}
