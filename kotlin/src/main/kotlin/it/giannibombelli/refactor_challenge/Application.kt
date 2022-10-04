package it.giannibombelli.refactor_challenge

fun main(args: Array<String>) {
    val fizzBuzz = FizzBuzz()
    for (number in 1..100) {
        val say = fizzBuzz.say(number)
        println(say)
    }
}
