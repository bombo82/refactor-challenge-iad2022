using csharp;

var fizzBuzz = new FizzBuzz(new[]
{
    new DivisorAndWord(3, "Fizz"),
    new DivisorAndWord(5, "Buzz")
});

foreach (var number in Enumerable.Range(1, 100))
{
    var say = fizzBuzz.Say(number);
    Console.WriteLine(say);
}