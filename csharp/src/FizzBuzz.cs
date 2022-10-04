namespace csharp;

public class FizzBuzz : IFizzBuzz
{
    private readonly DivisorAndWord[] _divisorAndWords;

    public FizzBuzz(DivisorAndWord[] divisorAndWords)
    {
        this._divisorAndWords = divisorAndWords;
    }

    public string Say(int number)
    {
        var result = "";
        foreach (var divisorAndWord in _divisorAndWords)
        {
            result += divisorAndWord.GetWordOrEmpty(number);
        }

        if (result != "")
        {
            return result;
        }

        return number.ToString();
    }
}