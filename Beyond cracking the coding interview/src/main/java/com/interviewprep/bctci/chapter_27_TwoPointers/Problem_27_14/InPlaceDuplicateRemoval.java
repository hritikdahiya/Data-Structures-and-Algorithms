package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_14;

public class InPlaceDuplicateRemoval {
    // returns the number od unique elements
    public static int inPlaceDuplicateRemoval(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return n;
        }

        // If duplicate, seeker moves ahead, else copy seeker's value to writer
        // if no duplicate, writer and seeker are same, so overwriting the same value does not have a side effect
        int seeker = 1, writer = 1;
        while (seeker < n) {
            if (arr[seeker] != arr[seeker - 1]) {
                arr[writer++] = arr[seeker];
            }
            seeker++;
        }

        return writer;
    }
}
