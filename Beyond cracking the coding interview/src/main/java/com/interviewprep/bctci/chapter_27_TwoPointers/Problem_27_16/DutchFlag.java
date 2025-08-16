package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_16;

import static com.interviewprep.bctci.chapter_27_TwoPointers.Utility.swapChar;

public class DutchFlag {
    public static void dutchFlagSortWithCount(char[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int rCount = 0, wCount = 0;
        for (char c : arr) {
            if (c == 'R') rCount++;
            if (c == 'W') wCount++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = rCount-- > 0 ? 'R' : (wCount-- > 0 ? 'W' : 'B');
        }
    }

    public static void dutchFlagSortWithPartitionSortAlgorithm(char[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int rPointer = 0, bPointer = n - 1;
        int it = 0;

        while (it <= bPointer) {
            if (arr[it] == 'R') {
                swapChar(arr, it, rPointer);
                rPointer++;
                it++;
            } else if (arr[it] == 'B') {
                swapChar(arr, it, bPointer);
                bPointer--;
            } else {
                it++;
            }
        }
    }
}
