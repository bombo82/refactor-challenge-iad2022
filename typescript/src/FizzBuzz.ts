import DivisorAndWord from "./DivisorAndWord";
import {IFizzBuzz} from "./IFizzBuzz";

export class FizzBuzz implements IFizzBuzz {
    private readonly divisorAndWords: DivisorAndWord[];

    constructor(divisorAndWords: DivisorAndWord[]) {
        this.divisorAndWords = divisorAndWords;
    }

    public say(inputNumber: number): string {
        let result = "";
        for (const divisorAndWord of this.divisorAndWords) {
            result += divisorAndWord.getWordOrEmpty(inputNumber);
        }

        if (result !== "") {
            return result;
        }

        return String(inputNumber);
    }
}
