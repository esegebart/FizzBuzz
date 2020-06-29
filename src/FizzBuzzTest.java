import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        //simplest thing first, pass it a one
        // Create new FizzBuzz object
        // Expect 1, get a one
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsATwo(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        // passing fizzbuzz a different number
        assertEquals("2", fizzBuzz.fizz(2));
    }

}
