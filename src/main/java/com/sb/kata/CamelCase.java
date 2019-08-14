package com.sb.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CamelCase {
    public static String camelCase(String str) {
        String formattedString = str.trim().replaceAll(" +", " ");
        if (str.length() == 0) {
            return "";
        }
        List<String> words = Arrays.stream(formattedString.split(" "))
            .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
            .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }
}
