/**
 * FizzBuzz
 */
public class FizzBuzz {
    public String fizzBuzz(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        String fizz = "Fizz";
        String buzz = "Buzz";
        if (isDivisibleBy3 && isDivisibleBy5) {
            return (fizz + buzz);
        } else if (isDivisibleBy3) {
            return (fizz);
        } else if (isDivisibleBy5) {
            return (buzz);
        } else {
            return "" + number;
        }
    }
}