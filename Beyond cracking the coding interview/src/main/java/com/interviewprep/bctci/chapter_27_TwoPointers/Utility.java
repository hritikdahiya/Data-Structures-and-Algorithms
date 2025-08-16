package com.interviewprep.bctci.chapter_27_TwoPointers;

public class Utility {
    public static void swap(int[] arr, int l, int r) {
        int curr = arr[l];
        arr[l] = arr[r];
        arr[r] = curr;
    }

    public static void swapChar(char[] arr, int l, int r) {
        char curr = arr[l];
        arr[l] = arr[r];
        arr[r] = curr;
    }
}
