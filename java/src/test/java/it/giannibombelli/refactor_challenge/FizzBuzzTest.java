package it.giannibombelli.refactor_challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void simpleNumber() {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    void fizz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.say(3));
    }

    @Test
    void buzz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.say(5));
    }

    @Test
    void fizzBuzz() {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.say(15));
    }
}
