package it.giannibombelli.refactor_challenge;

import java.util.Arrays;
import java.util.List;

public class Application {
    private static final List<DivisorAndWord> divisorAndWords = Arrays.asList(
            new DivisorAndWord(3, "Fizz"),
            new DivisorAndWord(5, "Buzz")
    );

    public static void main(String[] args) {
        final FizzBuzz fizzBuzz = new FizzBuzz(divisorAndWords);
        for (int number = 1; number <= 100; number++) {
            final String say = fizzBuzz.say(number);
            System.out.println(say);
        }
    }
}
