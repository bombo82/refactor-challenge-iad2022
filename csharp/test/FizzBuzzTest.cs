using csharp;

namespace test;

public class FizzBuzzTests
{
    [Test]
    public void Simple_Number()
    {
        var fizzBuzz = new FizzBuzz();
        Assert.Multiple(() =>
        {
            Assert.That(fizzBuzz.Say(1), Is.EqualTo("1"));
            Assert.That(fizzBuzz.Say(2), Is.EqualTo("2"));
        });
    }

    [Test]
    public void Fizz()
    {
        var fizzBuzz = new FizzBuzz();
        Assert.That(fizzBuzz.Say(3), Is.EqualTo("Fizz"));
    }

    [Test]
    public void Buzz()
    {
        var fizzBuzz = new FizzBuzz();
        Assert.That(fizzBuzz.Say(5), Is.EqualTo("Buzz"));
    }

    [Test]
    public void FizzBuzz()
    {
        var fizzBuzz = new FizzBuzz();
        Assert.That(fizzBuzz.Say(15), Is.EqualTo("FizzBuzz"));
    }
}