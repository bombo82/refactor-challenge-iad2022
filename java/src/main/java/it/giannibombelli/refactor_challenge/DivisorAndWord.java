package it.giannibombelli.refactor_challenge;

public class DivisorAndWord {
    private final int divisor;
    private final String word;

    public DivisorAndWord(int divisor, String word) {
        this.divisor = divisor;
        this.word = word;
    }

    public String getWordOrEmpty(int number) {
        return number % divisor == 0 ? word : "";
    }
}
