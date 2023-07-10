package ru.youngstanis.patterns

class UserCompObj private constructor(val nickname: String) {

    // Это фабрика, в которой в зависимости от метода мы создаем объект
    companion object {
        fun newSubscribingUser(email: String): UserCompObj =
            UserCompObj(email.substringBefore("@"))

        fun newFacebookUser(accountId: Int): UserCompObj =
            UserCompObj(getUsernameByAccount(accountId))

        private fun getUsernameByAccount(accountId: Int): String =
            if(accountId % 2 == 0) {
                "Stas"
            } else {
                "Non Stas"
            }

    }
}

fun main() {
    val subscribingUser = UserCompObj.newSubscribingUser("vjshnjd@gmail.com")
    println(subscribingUser.nickname)
    val facebookUser = UserCompObj.newFacebookUser(13215144)
    println(facebookUser.nickname)
}

