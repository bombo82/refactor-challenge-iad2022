using csharp;

namespace test;

public class FizzBuzzTests
{
    private readonly DivisorAndWord[] _divisorAndWords = new[]
    {
        new DivisorAndWord(3, "Fizz"),
        new DivisorAndWord(5, "Buzz"),
    };

    [Test]
    public void No_Match()
    {
        var fizzBuzz = new FizzBuzz(_divisorAndWords);
        Assert.Multiple(() =>
        {
            Assert.That(fizzBuzz.Say(1), Is.EqualTo("1"));
            Assert.That(fizzBuzz.Say(2), Is.EqualTo("2"));
        });
    }

    [Test]
    public void SingleMatch()
    {
        var fizzBuzz = new FizzBuzz(_divisorAndWords);
        Assert.Multiple(() =>
        {
            Assert.That(fizzBuzz.Say(3), Is.EqualTo("Fizz"));
            Assert.That(fizzBuzz.Say(3 * 2), Is.EqualTo("Fizz"));
        });
    }

    [Test]
    public void MultipleMatch()
    {
        var fizzBuzz = new FizzBuzz(_divisorAndWords);
        Assert.Multiple(() =>
        {
            Assert.That(fizzBuzz.Say(3 * 5), Is.EqualTo("FizzBuzz"));
            Assert.That(fizzBuzz.Say(3 * 5 * 2), Is.EqualTo("FizzBuzz"));
        });
    }
}