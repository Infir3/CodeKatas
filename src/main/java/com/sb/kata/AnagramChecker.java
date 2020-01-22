package com.sb.kata;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramChecker {

    public boolean check(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        if (a.equals(b)) {
            return false;
        }

        Map<Character, Integer> aChars = this.toCharMap(a);
        Map<Character, Integer> bChars = this.toCharMap(b);

        for (Map.Entry<Character, Integer> entry : aChars.entrySet()) {
            if (!bChars.containsKey(entry.getKey())) {
                return false;
            }
            if (!bChars.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> toCharMap(String str) {
        List<Character> chars = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Map<Character, Integer> charMap = new HashMap<>();
        chars.forEach(character -> {
            Integer count;
            if (charMap.containsKey(character)) {
                count = charMap.get(character);
                count++;
                charMap.put(character, count);
            } else {
                charMap.put(character, 1);
            }
        });

        return charMap;
    }
}
