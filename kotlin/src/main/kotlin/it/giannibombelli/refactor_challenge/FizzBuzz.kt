package it.giannibombelli.refactor_challenge

class FizzBuzz : FizzBuzzInterface {
    override fun say(number: Int): String {
        val pair = Pair(3, "Fizz")
        val divisorAndWordList = listOf(pair, Pair(5, "Buzz"))

        var result = ""

        for (item in divisorAndWordList) {
            result += say(number, item)
        }

        if (result.isNotEmpty())
            return result

        return number.toString()
    }

    private fun say(number: Int, item: Pair<Int, String>): String {
        return if (number % item.first == 0) {
            item.second
        } else {
            ""
        }
    }
}
