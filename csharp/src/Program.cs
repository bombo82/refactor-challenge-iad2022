using csharp;

var fizzBuzz = new FizzBuzz();
foreach (var number in Enumerable.Range(1, 100))
{
    var say = fizzBuzz.Say(number);
    Console.WriteLine(say);
}