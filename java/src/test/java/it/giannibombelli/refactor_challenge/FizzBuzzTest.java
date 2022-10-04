package it.giannibombelli.refactor_challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private final List<DivisorAndWord> divisorAndWords = Arrays.asList(
            new DivisorAndWord(3, "Fizz"),
            new DivisorAndWord(5, "Buzz")
    );

    @Test
    public void noMatch() {
        final FizzBuzz fizzBuzz = new FizzBuzz(divisorAndWords);
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    public void singleMatch() {
        final FizzBuzz fizzBuzz = new FizzBuzz(divisorAndWords);
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(3 * 2));
    }

    @Test
    public void multipleMatch() {
        final FizzBuzz fizzBuzz = new FizzBuzz(divisorAndWords);
        assertEquals("FizzBuzz", fizzBuzz.say(3 * 5));
        assertEquals("FizzBuzz", fizzBuzz.say(3 * 5 * 2));
    }
}
