package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_12;

public class ArrayReversal {
    public static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int leftEle = arr[l];
            arr[l++] = arr[r];
            arr[r--] = leftEle;
        }
    }
}
