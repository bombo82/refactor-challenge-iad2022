namespace csharp;

public class DivisorAndWord
{
    private readonly int _divisor;
    private readonly string _word;

    public DivisorAndWord(int divisor, string word)
    {
        _divisor = divisor;
        _word = word;
    }

    public string GetWordOrEmpty(int number)
    {
        return number % _divisor == 0 ? _word : "";
    }
}