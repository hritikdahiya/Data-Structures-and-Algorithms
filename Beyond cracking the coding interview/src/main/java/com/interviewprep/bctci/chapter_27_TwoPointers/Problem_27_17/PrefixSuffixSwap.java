package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_17;

import static com.interviewprep.bctci.chapter_27_TwoPointers.Utility.swapChar;

public class PrefixSuffixSwap {
    public static void prefixSuffixSwap(char[] arr) {
        int n = arr.length;
        if (n == 0) {
            return;
        }
        if (n % 3 > 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < n / 3; i++) {
            // [ a,...,b,...,c...]
            swapChar(arr, i, i + n / 3);
            // [ b,...,a,...,c...]
            swapChar(arr, i + n / 3, i + n / 3 + n / 3);
            // [ b,...,c,...,a...]
        }
    }
}
