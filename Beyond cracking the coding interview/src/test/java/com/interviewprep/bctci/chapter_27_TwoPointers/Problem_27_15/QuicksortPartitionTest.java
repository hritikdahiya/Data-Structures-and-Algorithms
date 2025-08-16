package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuicksortPartitionTest {

    @Test
    public void partitionByPivotTwoPassTest() {
        int[] arr = new int[]{1};
        int pivot = 2;
        QuicksortPartition.partitionByPivotTwoPass(arr, pivot);
        Assertions.assertArrayEquals(new int[]{1}, arr);

        arr = new int[]{1, 7, 2, 3, 3, 5, 3};
        pivot = 4;
        QuicksortPartition.partitionByPivotTwoPass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        pivot = 3;
        QuicksortPartition.partitionByPivotTwoPass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        arr = new int[]{2, 2, 2, 2};
        pivot = 2;
        QuicksortPartition.partitionByPivotTwoPass(arr, pivot);
        verifySortCorrectness(arr, pivot);


        arr = new int[]{2, 1, 4, 2};
        pivot = 5;
        QuicksortPartition.partitionByPivotTwoPass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        arr = new int[]{9, 5, 78, 6, 5};
        pivot = 4;
        QuicksortPartition.partitionByPivotTwoPass(arr, pivot);
        verifySortCorrectness(arr, pivot);
    }

    @Test
    public void partitionByPivotSinglePassTest() {
        int[] arr = new int[]{1};
        int pivot = 2;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        Assertions.assertArrayEquals(new int[]{1}, arr);

        arr = new int[]{1, 7, 2, 3, 3, 5, 3};
        pivot = 4;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        pivot = 3;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        arr = new int[]{2, 2, 2, 2};
        pivot = 2;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        verifySortCorrectness(arr, pivot);


        arr = new int[]{2, 1, 4, 2};
        pivot = 5;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        arr = new int[]{9, 5, 78, 6, 5};
        pivot = 4;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        verifySortCorrectness(arr, pivot);

        //edge case
        arr = new int[]{3, 3, 3, 5, 1};
        pivot = 3;
        QuicksortPartition.partitionByPivotSinglePass(arr, pivot);
        verifySortCorrectness(arr, pivot);
    }

    private static void verifySortCorrectness(int[] arr, int pivot) {
        int beforePivot = 0, afterPivot;
        while (beforePivot < arr.length && arr[beforePivot] < pivot) {
            beforePivot++;
        }
        afterPivot = beforePivot;
        while (afterPivot < arr.length && arr[afterPivot] == pivot) {
            afterPivot++;
        }

        for (int i = 0; i < beforePivot; i++) {
            Assertions.assertTrue(arr[i] < pivot);
        }
        for (int i = beforePivot; i < afterPivot; i++) {
            Assertions.assertEquals(arr[i], pivot);
        }
        for (int i = afterPivot; i < arr.length; i++) {
            Assertions.assertTrue(arr[i] > pivot);
        }
    }
}