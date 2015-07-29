package com.zenika.tdd.fizzbuzz.iteration04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mariolet on 7/27/15.
 */
public class FizzBuzzTest {

    @Test
    public void printAnInteger() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.printInteger(1));
    }

    @Test
    public void printAMultipleOfThree() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("fizz", fb.printInteger(3));
        assertEquals("fizz", fb.printInteger(6));
    }

    @Test
    public void printMultiplesOfFive() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("buzz", fb.printInteger(5));
        assertEquals("buzz", fb.printInteger(20));
    }

    @Test
    public void printMultiplesOfThreeAndFive() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("fizzbuzz", fb.printInteger(15));
        assertEquals("fizzbuzz", fb.printInteger(30));
    }
}