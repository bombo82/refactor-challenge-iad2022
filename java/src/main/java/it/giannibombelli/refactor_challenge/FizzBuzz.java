package it.giannibombelli.refactor_challenge;

import java.util.List;

public class FizzBuzz implements FizzBuzzInterface {
    private final List<DivisorAndWord> divisorAndWords;

    public FizzBuzz(List<DivisorAndWord> divisorAndWords) {
        this.divisorAndWords = divisorAndWords;
    }

    @Override
    public String say(int number) {
        var result = "";
        for (DivisorAndWord divisorAndWord : divisorAndWords) {
            result += divisorAndWord.getWordOrEmpty(number);
        }

        if (!result.equals("")) {
            return result;
        }

        return String.valueOf(number);
    }
}
