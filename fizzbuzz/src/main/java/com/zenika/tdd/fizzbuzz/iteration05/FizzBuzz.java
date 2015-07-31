package com.zenika.tdd.fizzbuzz.iteration05;

/**
 * Created by mariolet on 7/27/15.
 */

public class FizzBuzz {

    protected String print(int i) {
        if (isMultipleOfThreeAndFive(i))
            return "fizzbuzz";
        if (isMultipleOfThree(i))
            return "fizz";
        if (isMultipleOfFive(i))
            return "buzz";
        return Integer.toString(i);
    }

    private boolean isMultipleOfFive(int i) {
        return i % 5 == 0;
    }

    private boolean isMultipleOfThree(int i) {
        return i % 3 == 0;
    }

    private boolean isMultipleOfThreeAndFive(int i) {
        return i % 15 == 0;
    }

    public String run(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(print(i));
        }
        return sb.toString();
    }
}
