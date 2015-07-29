package com.zenika.tdd.fizzbuzz.iteration05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mariolet on 7/27/15.
 */
public class FizzBuzzTest {

    @Test
    public void printAnInteger() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.run(1));
    }

    @Test
    public void printAMultipleOfThree() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("12fizz", fb.run(3));
        assertEquals("12fizz", fb.run(6));
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
        assertEquals("fizzbuzz", fb.run(15).endsWith(-8));
        assertEquals("fizzbuzz", fb.run(30).substring(-8));
    }

    @Test
    public void printMultipleIntegers() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("12fizz34buzz", fb.run(5));
        assertEquals("12fizz34buzz67891011121314fizzbuzz16", fb.run(16));
    }
}