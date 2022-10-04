export default class DivisorAndWord {
    private readonly divisor: number;
    private readonly word: string;

    constructor(divisor: number, word: string) {
        this.divisor = divisor;
        this.word = word;
    }

    public getWordOrEmpty(inputNumber: number): string {
        return inputNumber % this.divisor === 0 ? this.word : "";
    }
}
