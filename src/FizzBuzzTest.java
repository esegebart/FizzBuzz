import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsATwo(){
        // passing fizzbuzz a different number
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
        assertEquals("fizz", fizzBuzz.fizz(3));
        assertEquals("fizz", fizzBuzz.fizz(6));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz(){
        assertEquals("buzz", fizzBuzz.fizz(5));
        assertEquals("buzz", fizzBuzz.fizz(10));
    }

}
