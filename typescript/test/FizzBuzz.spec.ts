import {assert} from "chai";
import DivisorAndWord from "../src/DivisorAndWord";
import {FizzBuzz} from "../src/FizzBuzz";

describe("FizzBuzz Test Suite", () => {
    let divisorAndWords = [
        new DivisorAndWord(3, "Fizz"),
        new DivisorAndWord(5, "Buzz"),
    ];

    it("No match", () => {
        let fizzBuzz = new FizzBuzz(divisorAndWords);
        assert.equal(fizzBuzz.say(1), "1");
        assert.equal(fizzBuzz.say(2), "2");
    });

    it("Single match", () => {
        let fizzBuzz = new FizzBuzz(divisorAndWords);
        assert.equal(fizzBuzz.say(3), "Fizz");
        assert.equal(fizzBuzz.say(3 * 2), "Fizz");
    });

    it("Multiple match", () => {
        let fizzBuzz = new FizzBuzz(divisorAndWords);
        assert.equal(fizzBuzz.say(3 * 5), "FizzBuzz");
        assert.equal(fizzBuzz.say(3 * 5 * 2), "FizzBuzz");
    });
});
