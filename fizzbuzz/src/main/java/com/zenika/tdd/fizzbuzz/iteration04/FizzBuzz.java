package com.zenika.tdd.fizzbuzz.iteration04;

/**
 * Created by mariolet on 7/27/15.
 */

public class FizzBuzz {
    public String printInteger(int i) {
        if (i % 15 == 0 )
            return "fizzbuzz";
        if (i % 3 == 0)
            return "fizz";
        if (i % 5 == 0)
            return "buzz";
        return Integer.toString(i);
    }
}
