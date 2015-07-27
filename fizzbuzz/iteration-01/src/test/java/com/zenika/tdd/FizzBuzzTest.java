package com.zenika.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

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