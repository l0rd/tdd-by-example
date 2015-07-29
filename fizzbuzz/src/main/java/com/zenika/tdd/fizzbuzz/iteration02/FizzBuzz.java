package com.zenika.tdd.fizzbuzz.iteration02;

/**
 * Created by mariolet on 7/27/15.
 */

public class FizzBuzz {
    public String printInteger(int i) {
        if (i % 3 == 0)
            return "fizz";
        return Integer.toString(i);
    }
}
