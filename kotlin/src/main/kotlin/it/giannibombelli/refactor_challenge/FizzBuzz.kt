package it.giannibombelli.refactor_challenge

class FizzBuzz(private val divisorAndWords: List<DivisorAndWord>) : FizzBuzzInterface {

    override fun say(number: Int): String {
        var result = ""
        for (divisorAndWord in divisorAndWords) {
            result += divisorAndWord.getWordOrEmpty(number)
        }

        if (result.isNotEmpty()) {
            return result
        }
        return number.toString()
    }
}
