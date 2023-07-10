package ru.youngstanis.poligon

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm

class JwtVerifier(private val secretKey: String) {
    fun verify(token: String): Boolean =
        try {
            val algorithm = Algorithm.HMAC256(secretKey)
            val verifier = JWT.require(algorithm).build()
            verifier.verify(token)
            true
        } catch (e: Exception) {
            println("An error occured: ${e.message}")
            false
        }
}

fun main(args: Array<String>) {
    val secretKey = "super-puper-secret-key"
    val token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IlN0YW5pc2xhdiBHcm9raG90b3YiLCJpYXQiOjE1MTYyMzkwMjJ9.LO5d__KjtSIeBtXdtT6tnrqS2wpEeIzof_rtQAUEp2s"

    val jwtVerifier = JwtVerifier(secretKey)

    if(jwtVerifier.verify(token)) {
        println("TOKEN IS VALID")
    } else {
        println("TOKEN IS INVALID")
    }
}
