package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_10;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbersInRange {
    public static int[] findMissingNumbers(int[] arr, int low, int high) {
        int n = arr.length;

        int index = 0;
        int val = low;
        List<Integer> result = new ArrayList<>();
        while (index < n && val <= high) {
            if (val > arr[index]) {
                index++;
            } else if (val == arr[index]) {
                index++;
                val++;
            } else {
                result.add(val);
                val++;
            }
        }
        while (val <= high) {
            result.add(val++);
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
