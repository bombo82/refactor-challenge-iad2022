package it.giannibombelli.refactor_challenge

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {

    private val divisorAndWords = listOf(
        DivisorAndWord(3, "Fizz"),
        DivisorAndWord(5, "Buzz")
    )

    @Test
    internal fun noMatch() {
        val fizzBuzz = FizzBuzz(divisorAndWords)
        assertEquals("1", fizzBuzz.say(1))
        assertEquals("2", fizzBuzz.say(2))
    }

    @Test
    internal fun singleMatch() {
        val fizzBuzz = FizzBuzz(divisorAndWords)
        assertEquals("Fizz", fizzBuzz.say(3))
        assertEquals("Fizz", fizzBuzz.say(3 * 2))
    }

    @Test
    internal fun multipleMatch() {
        val fizzBuzz = FizzBuzz(divisorAndWords)
        assertEquals("FizzBuzz", fizzBuzz.say(3 * 5))
        assertEquals("FizzBuzz", fizzBuzz.say(3 * 5 * 2))
    }
}
