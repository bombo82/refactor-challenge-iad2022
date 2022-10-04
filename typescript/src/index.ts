import {FizzBuzz} from "./FizzBuzz";

let fizzBuzz = new FizzBuzz();
for (let inputNumber = 1; inputNumber <= 100; inputNumber++) {
    let say = fizzBuzz.say(inputNumber);
    console.log(say);
}
