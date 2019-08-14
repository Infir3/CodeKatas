package com.sb.kata.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void doFizzBuzz_1() {
        assertEquals("1", FizzBuzz.doFizzBuzz(1));
    }

    @Test
    public void doFizzBuzz_3() {
        assertEquals("Fizz", FizzBuzz.doFizzBuzz(3));
    }

    @Test
    public void doFizzBuzz_5() {
        assertEquals("Buzz", FizzBuzz.doFizzBuzz(5));
    }

    @Test
    public void doFizzBuzz_6() {
        assertEquals("Fizz", FizzBuzz.doFizzBuzz(6));
    }

    @Test
    public void doFizzBuzz_15() {
        assertEquals("FizzBuzz", FizzBuzz.doFizzBuzz(15));
    }

    @Test
    public void doFizzBuzz_13() {
        assertEquals("Fizz", FizzBuzz.doFizzBuzz(13));
    }

    @Test
    public void doFizzBuzz_52() {
        assertEquals("Buzz", FizzBuzz.doFizzBuzz(52));
    }
    
    @Test
    public void doFizzBuzz_all() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(FizzBuzz.doFizzBuzz(i));
        }
    }
}