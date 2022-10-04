package it.giannibombelli.refactor_challenge;

public class Application {
    public static void main(String[] args) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        for (int number = 1; number <= 100; number++) {
            final String say = fizzBuzz.say(number);
            System.out.println(say);
        }
    }
}
