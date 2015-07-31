package com.zenika.tdd.fizzbuzz.iteration03;

/**
 * Created by mariolet on 7/27/15.
 */

public class FizzBuzz {
    public String print(int i) {
        if (isMultipleOfThree(i))
            return "fizz";
        if (isMultipleOfFive(i))
            return "buzz";
        return Integer.toString(i);
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

}
