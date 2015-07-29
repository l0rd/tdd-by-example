package com.zenika.tdd.fizzbuzz.iteration05;

/**
 * Created by mariolet on 7/27/15.
 */

public class FizzBuzz {
    private String printInteger(int i) {
        if (i % 15 == 0 )
            return "fizzbuzz";
        if (i % 3 == 0)
            return "fizz";
        if (i % 5 == 0)
            return "buzz";
        return Integer.toString(i);
    }

    public String run(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(printInteger(i));
        }
        return sb.toString();
    }
}
