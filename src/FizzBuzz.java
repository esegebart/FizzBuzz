public class FizzBuzz {

    public String fizz(Integer inputNumber) {
        if((inputNumber % 3 == 0 && inputNumber % 5 == 0)){
            return "fizzbuzz";
        }

        if(inputNumber % 3 == 0)
            return "fizz";
        else if(inputNumber % 5 == 0)
            return "buzz";
        // now returning numbers to string
        return inputNumber.toString();
    }
}
