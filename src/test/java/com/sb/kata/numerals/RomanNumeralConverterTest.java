package com.sb.kata.numerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter;

    @BeforeEach
    public void setup() {
        this.converter = new RomanNumeralConverter();
    }

    @Test
    public void convertToArabicNumeral_I() {
        int result = converter.convertToArabicNumeral("I");
        assertEquals(1, result);
    }

    @Test
    public void convertToArabicNumeral_II() {
        int result = converter.convertToArabicNumeral("II");
        assertEquals(2, result);
    }

    @Test
    public void convertToArabicNumeral_IV() {
        int result = converter.convertToArabicNumeral("IV");
        assertEquals(4, result);
    }

    @Test
    public void convertToArabicNumeral_V() {
        int result = converter.convertToArabicNumeral("V");
        assertEquals(5, result);
    }

    @Test
    public void convertToArabicNumeral_IX() {
        int result = converter.convertToArabicNumeral("IX");
        assertEquals(9, result);
    }

    @Test
    public void convertToArabicNumeral_XLII() {
        int result = converter.convertToArabicNumeral("XLII");
        assertEquals(42, result);
    }

    @Test
    public void convertToArabicNumeral_XCIX() {
        int result = converter.convertToArabicNumeral("XCIX");
        assertEquals(99, result);
    }

    @Test
    public void convertToArabicNumeral_MMXIII() {
        int result = converter.convertToArabicNumeral("MMXIII");
        assertEquals(2013, result);
    }
}