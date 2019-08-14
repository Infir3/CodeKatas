package com.sb.kata;

public class ShortestWord {
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        String shortestWord = arr[0];
        for (int i = 0; i < arr.length; i++) {
            String currentWord = arr[i];
            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;
            }
        }
        return shortestWord.length();
    }
}
