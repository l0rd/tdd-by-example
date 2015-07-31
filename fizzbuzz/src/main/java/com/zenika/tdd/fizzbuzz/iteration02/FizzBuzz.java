package com.zenika.tdd.fizzbuzz.iteration02;

/**
 * Created by mariolet on 7/27/15.
 */

public class FizzBuzz {

    public String print(int i) {
        if (isMultipleOfThree(i))
            return "fizz";
        return Integer.toString(i);
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }

}
