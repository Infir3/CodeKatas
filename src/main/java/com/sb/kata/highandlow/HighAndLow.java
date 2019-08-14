package com.sb.kata.highandlow;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class HighAndLow {

    public static String solve1(String numbers) {
        String[] stringArray = numbers.split("\\s+");
        int highestNumber = 0;
        int lowestNumber = 0;
        for (int i = 0; i < stringArray.length; i++) {
            int currentNumber = Integer.parseInt(stringArray[i]);
            if (i == 0) {
                highestNumber = currentNumber;
                lowestNumber = currentNumber;
            }
            if (currentNumber > highestNumber) {
                highestNumber = currentNumber;
            }
            if (currentNumber < lowestNumber) {
                lowestNumber = currentNumber;
            }
        }
        return highestNumber + " " + lowestNumber;
    }

    public static String solve2(String numbers) {
        // Nachteil: über das Array wird zweimal geloopt
        int min = Arrays.stream(numbers.split(" "))
            .mapToInt(Integer::parseInt)
            .min()
            .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
            .mapToInt(Integer::parseInt)
            .max()
            .getAsInt();

        return String.format("%d %d", max, min);
    }

    public static String solve3(String numbers) {
        IntSummaryStatistics summary = Arrays
            .stream(numbers.split(" "))
            .collect(Collectors.summarizingInt(Integer::parseInt));
        return String.format("%d %d", summary.getMax(), summary.getMin());
    }
}
