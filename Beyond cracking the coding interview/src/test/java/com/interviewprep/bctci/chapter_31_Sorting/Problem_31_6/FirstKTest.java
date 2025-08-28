package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FirstKTest {
    @Test
    public void findSmallestKElementsWithHeapTest() {
        int[] arr = new int[]{0, 9, 1, 8, 2, 7, 3, 6, 4, 5};
        int k = 4;

        int[] expectedArr = new int[]{0, 1, 2, 3};
        int[] actualArr = FirstK.findKSmallestElementsWithHeap(arr, k);
        int[] actualArr2 = FirstK.findKSmallestElementsQuickSelect(arr, k);

        verifyResult(expectedArr, actualArr);
        verifyResult(expectedArr, actualArr2);


        // duplicates
        arr = new int[]{0, 0, 9, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 8, 2, 2, 7, 7, 3, 3, 6, 6, 4, 4, 5, 5};
        k = 6;

        expectedArr = new int[]{0, 0, 1, 1, 1, 1};
        actualArr = FirstK.findKSmallestElementsWithHeap(arr, k);
        actualArr2 = FirstK.findKSmallestElementsQuickSelect(arr, k);

        verifyResult(expectedArr, actualArr);
        verifyResult(expectedArr, actualArr2);
    }

    private void verifyResult(int[] expectedArr, int[] actualArr) {
        Arrays.sort(expectedArr);
        Arrays.sort(actualArr);
        Assertions.assertArrayEquals(expectedArr, actualArr);
    }
}