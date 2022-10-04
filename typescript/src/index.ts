import DivisorAndWord from "./DivisorAndWord";
import {FizzBuzz} from "./FizzBuzz";

let fizzBuzz = new FizzBuzz([
    new DivisorAndWord(3, "Fizz"),
    new DivisorAndWord(5, "Buzz"),
]);

for (let inputNumber = 1; inputNumber <= 100; inputNumber++) {
    let say = fizzBuzz.say(inputNumber);
    console.log(say);
}
