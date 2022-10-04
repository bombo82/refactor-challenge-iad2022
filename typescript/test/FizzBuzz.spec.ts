import {assert} from "chai";
import {FizzBuzz} from "../src/FizzBuzz";

describe("FizzBuzz Test Suite", () => {
    it("simple number", () => {
        let fizzBuzz = new FizzBuzz();
        assert.equal(fizzBuzz.say(1), "1");
        assert.equal(fizzBuzz.say(2), "2");
    });

    it("Fizz", () => {
        let fizzBuzz = new FizzBuzz();
        assert.equal(fizzBuzz.say(3), "Fizz");
    });

    it("Buzz", () => {
        let fizzBuzz = new FizzBuzz();
        assert.equal(fizzBuzz.say(5), "Buzz");
    });

    it("FizzBuzz", () => {
        let fizzBuzz = new FizzBuzz();
        assert.equal(fizzBuzz.say(15), "FizzBuzz");
    });
});
