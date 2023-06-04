package ru.youngstanis.poligon

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class RegexTest {

    private val regex = """a([bc]+)d?""".toRegex()

    @Test
    fun containsMatchInTestPass() = assertTrue(containsMatchIn(regex, "xabcdy"))

    @Test
    fun matchesTestPass() = assertTrue(matches(regex, "abcd"))

    @Test
    fun matchesTestFail() = assertFalse(matches2(regex, "xabcdy"))

    @Test
    fun matchEntireTest() = assertEquals("abbccbbd", matchEntire(regex, "abbccbbd")?.value)

    @Test
    fun findTest() = assertEquals("abcb", find(regex, "abcbabbd")?.value)

    @Test
    fun findAllTest() {
        val actual = findAll(regex, "abcb abbd")
        val it = actual.iterator()
        assertEquals("abcb", it.next().value)
        assertEquals("abbd", it.next().value)
    }
}