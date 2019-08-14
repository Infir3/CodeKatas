package com.sb.kata.numerals;

public class RomanNumeralConverter {

    public int convertToArabicNumeral(String romanNumeral) {
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = this.getArabicalValue(currentChar);
            if (isCurrentValueNegative(romanNumeral, i, currentValue)) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }

    private boolean isCurrentValueNegative(String romanNumeral, int index, int currentValue) {
        if (romanNumeral.length() - 1 >= index + 1) {
            int nextValue = this.getArabicalValue(romanNumeral.charAt(index + 1));
            return nextValue > currentValue;
        } else {
            return false;
        }
    }

    private int getArabicalValue(char romanNumeral) {
        switch (romanNumeral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
