package com.sb.kata;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = sum(arr, 0, i);
            int rightSum = sum(arr, i + 1, arr.length);
            if (leftSum == rightSum) {
                result = i;
            }
        }
        return result;
    }

    private static int sum(int[] arr, int startIndex, int endIndex) {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
