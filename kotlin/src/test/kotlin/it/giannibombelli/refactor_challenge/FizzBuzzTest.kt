package it.giannibombelli.refactor_challenge

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FizzBuzzTest {

    @Test
    internal fun simpleNumber() {
        val fizzBuzz = FizzBuzz()
        assertEquals("1", fizzBuzz.say(1))
        assertEquals("2", fizzBuzz.say(2))
    }

    @Test
    internal fun fizz() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Fizz", fizzBuzz.say(3))
    }

    @Test
    internal fun buzz() {
        val fizzBuzz = FizzBuzz()
        assertEquals("Buzz", fizzBuzz.say(5))
    }

    @Test
    internal fun fizzBuzz() {
        val fizzBuzz = FizzBuzz()
        assertEquals("FizzBuzz", fizzBuzz.say(15))
    }
}
