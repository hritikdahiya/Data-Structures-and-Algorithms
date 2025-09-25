package com.interviewprep.bctci.chapter_38_SlidingWindows.Problem_38_16;

import java.util.Arrays;

public class SmallestRangeWithKElements {
    public static int[] findRange(int[] arr, int k) {
        Arrays.sort(arr);

        int l = 0, r = 0;
        int minRange = Integer.MAX_VALUE;
        int[] result = null;
        while (true) {
            boolean shouldGrow = r - l < k;
            if (shouldGrow) {
                if (r == arr.length) {
                    break;
                }
                r++;
            } else {
                if (arr[r - 1] - arr[l] < minRange) {
                    minRange = arr[r - 1] - arr[l];
                    result = new int[]{arr[l], arr[r - 1]};
                }
                l++;
            }
        }

        return result;
    }
}
