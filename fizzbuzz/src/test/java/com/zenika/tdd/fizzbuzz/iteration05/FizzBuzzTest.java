package com.zenika.tdd.fizzbuzz.iteration05;

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
    public void should_print_fizz_when_passing_a_mutiple_of_three() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("fizz", fb.print(3));
        assertEquals("fizz", fb.print(6));
    }

    @Test
    public void should_print_buzz_when_passing_a_mutiple_of_five() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("buzz", fb.print(5));
        assertEquals("buzz", fb.print(20));
    }

    @Test
    public void should_print_fizzbuzz_when_passing_a_mutiple_of_three_and_five() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("fizzbuzz", fb.print(15));
        assertEquals("fizzbuzz", fb.print(30));
    }

    @Test
    public void should_print_valid_string_when_running_fizzbuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("12fizz4buzz", fb.run(5));
        assertEquals("12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz16", fb.run(16));
        assertEquals("12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz" +
                "1617fizz19buzzfizz2223fizzbuzz26fizz2829fizzbuzz" +
                "3132fizz34buzzfizz3738fizzbuzz41fizz4344fizzbuzz" +
                "4647fizz49buzzfizz5253fizzbuzz56fizz5859fizzbuzz" +
                "6162fizz64buzzfizz6768fizzbuzz71fizz7374fizzbuzz" +
                "7677fizz79buzzfizz8283fizzbuzz86fizz8889fizzbuzz" +
                "9192fizz94buzzfizz9798fizzbuzz", fb.run(100));
    }
}