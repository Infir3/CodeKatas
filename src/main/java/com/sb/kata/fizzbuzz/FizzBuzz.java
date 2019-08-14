package com.sb.kata.fizzbuzz;

public class FizzBuzz {
    public static String doFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else if (String.valueOf(n).contains("3")) {
            return "Fizz";
        } else if (String.valueOf(n).contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}
