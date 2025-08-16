package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParitySortingTest {

    @Test
    void evenBeforeOddInwardPointerTest() {
        // empty array
        int[] arr = new int[0];
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // all odd
        arr = new int[]{1};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        arr = new int[]{1, 3, 5, 9, 7};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // all even
        arr = new int[]{2};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        arr = new int[]{2, 4, 6, 8};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // already all even before odd
        arr = new int[]{2, 4, 6, 1, 2, 3};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));
        // all odd before even
        arr = new int[]{1, 2, 3, 2, 4, 6};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // mixed odd and even
        arr = new int[]{1, 3, 2, 4, 5, 6, 7, 8, 78, 3, 5, 2, 2, 4, 5};
        ParitySorting.evenBeforeOdd(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));
    }

    @Test
    void evenBeforeOddSlowPointerTest() {
        // empty array
        int[] arr = new int[0];
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // all odd
        arr = new int[]{1};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        arr = new int[]{1, 3, 5, 9, 7};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // all even
        arr = new int[]{2};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        arr = new int[]{2, 4, 6, 8};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // already all even before odd
        arr = new int[]{2, 4, 6, 1, 2, 3};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));
        // all odd before even
        arr = new int[]{1, 2, 3, 2, 4, 6};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));

        // mixed odd and even
        arr = new int[]{1, 3, 2, 4, 5, 6, 7, 8, 78, 3, 5, 2, 2, 4, 5};
        ParitySorting.evenBeforeOddSlowPointer(arr);
        Assertions.assertTrue(verifyEvenBeforeOdd(arr));
    }

    private boolean verifyEvenBeforeOdd(int[] arr) {
        boolean firstOddEncountered = false;
        for (int item : arr) {
            if (firstOddEncountered) {
                if (item % 2 == 0) {
                    // any even item after the first odd
                    return false;
                }
            } else {
                if (item % 2 == 1) {
                    // set the odd encountered flag
                    firstOddEncountered = true;
                }
            }
        }

        return true;
    }
}