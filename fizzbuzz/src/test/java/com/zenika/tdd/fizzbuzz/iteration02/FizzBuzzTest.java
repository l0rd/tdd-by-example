package com.zenika.tdd.fizzbuzz.iteration02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mariolet on 7/27/15.
 */
public class FizzBuzzTest {

    @Test
    public void should_print_string_representation_when_passing_an_integer() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.print(1));
    }

    @Test
    public void should_print_fizz_when_passing_a_multiple_of_three() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("fizz", fb.print(3));
        assertEquals("fizz", fb.print(6));
    }
}