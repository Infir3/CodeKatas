package com.sb.kata.highandlow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HighAndLowTest {

    @Test
    public void test1() {
        assertEquals("5 1", HighAndLow.solve1("1 2 3 4 5"));
        assertEquals("5 1", HighAndLow.solve2("1 2 3 4 5"));
        assertEquals("5 1", HighAndLow.solve3("1 2 3 4 5"));
    }

    @Test
    public void test2() {
        assertEquals("5 -3", HighAndLow.solve1("1 2 -3 4 5"));
        assertEquals("5 -3", HighAndLow.solve2("1 2 -3 4 5"));
        assertEquals("5 -3", HighAndLow.solve3("1 2 -3 4 5"));
    }

    @Test
    public void test3() {
        assertEquals("9 -5", HighAndLow.solve1("1 9 3 4 -5"));
        assertEquals("9 -5", HighAndLow.solve2("1 9 3 4 -5"));
        assertEquals("9 -5", HighAndLow.solve3("1 9 3 4 -5"));
    }
}