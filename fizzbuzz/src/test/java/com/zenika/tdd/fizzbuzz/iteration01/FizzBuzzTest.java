package com.zenika.tdd.fizzbuzz.iteration01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by mariolet on 7/27/15.
 */
public class FizzBuzzTest {

    @Test
    public void printAnInteger() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.printInteger(1));
    }
}