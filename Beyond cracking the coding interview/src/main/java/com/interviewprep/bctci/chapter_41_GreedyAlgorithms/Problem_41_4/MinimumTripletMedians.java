package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_4;

import java.util.Arrays;

public class MinimumTripletMedians {
    public static int calculate(int[] arr) {
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < arr.length / 3; i++) {
            sum += arr[2 * i + 1];
        }

        return sum;
    }
}
