package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_7;

public class TwoSum {
    public static boolean twoSumExist(int[] arr) {
        int n = arr.length;
        // all positive array and all negative arrays will always fail
        if (n < 2 || arr[0] > 0 || arr[n - 1] < 0) {
            return false;
        }

        int l = 0, r = n - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == 0) {
                return true;
            } else if (sum < 0) {
                l++;
            } else {
                r--;
            }
        }

        return false;
    }
}
