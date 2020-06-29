public class FizzBuzz {

    public String fizz(Integer inputNumber) {
        if (inputNumber % 3 == 0)
            return "fizz";
        // now returning numbers to string
        return inputNumber.toString();
    }
}
