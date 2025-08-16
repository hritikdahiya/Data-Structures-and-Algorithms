package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DutchFlagTest {

    @Test
    public void dutchFlagSortWithCountTest() {
        // Single element value
        char[] arr = new char[]{'R'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'B'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);

        // Dual element values
        arr = new char[]{'R', 'W'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W', 'R'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'B', 'R'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'R', 'B'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'B', 'W'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W', 'B'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);

        // normal test cases

        arr = new char[]{'R', 'W', 'B', 'R', 'W', 'B', 'R'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W', 'W', 'W', 'B', 'R'};
        DutchFlag.dutchFlagSortWithCount(arr);
        verifySortCorrectness(arr);
    }

    @Test
    public void dutchFlagSortWithPartitionSortAlgorithmTest() {
        // Single element value
        char[] arr = new char[]{'R'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'B'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);

        // Dual element values
        arr = new char[]{'R', 'W'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W', 'R'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'B', 'R'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'R', 'B'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'B', 'W'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W', 'B'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);

        // normal test cases

        arr = new char[]{'R', 'W', 'B', 'R', 'W', 'B', 'R'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);
        arr = new char[]{'W', 'W', 'W', 'B', 'R'};
        DutchFlag.dutchFlagSortWithPartitionSortAlgorithm(arr);
        verifySortCorrectness(arr);

    }

    private static void verifySortCorrectness(char[] arr) {
        int beforePivot = 0, afterPivot;
        while (beforePivot < arr.length && arr[beforePivot] == 'R') {
            beforePivot++;
        }
        afterPivot = beforePivot;
        while (afterPivot < arr.length && arr[afterPivot] == 'W') {
            afterPivot++;
        }

        for (int i = 0; i < beforePivot; i++) {
            Assertions.assertEquals('R', arr[i]);
        }
        for (int i = beforePivot; i < afterPivot; i++) {
            Assertions.assertEquals('W', arr[i]);
        }
        for (int i = afterPivot; i < arr.length; i++) {
            Assertions.assertEquals('B', arr[i]);
        }
    }
}