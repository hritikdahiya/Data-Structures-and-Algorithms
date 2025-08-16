package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_15;

import static com.interviewprep.bctci.chapter_27_TwoPointers.Utility.swap;

public class QuicksortPartition {
    public static void partitionByPivotSinglePass(int[] arr, int pivot) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        // ltPivot is the writer pointer, any element less than pivot found is swapped with ltPivot
        // rtPivot is the writer pointer, any element greater than pivot found is swapped with rtPivot
        // this leads to all the pivot elements to bubble in between
        int ltPivot = 0, gtPivot = n - 1;
        int iterator = 0;
        while (iterator <= gtPivot) {
            if (arr[iterator] < pivot) {
                // if curr ele is less than pivot, swap with ltPivot and move on
                swap(arr, iterator, ltPivot);
                ltPivot++;
                iterator++;
            } else if (arr[iterator] > pivot) {
                // if curr ele is greater than pivot, swap with gtPivot, and check the swapped element again
                swap(arr, iterator, gtPivot);
                gtPivot--;
                // IMP - Do not increment iterator since we need to check what the swapped value is
            } else {
                // if val is pivot, do nothing
                iterator++;
            }
        }
    }

    public static void partitionByPivotTwoPass(int[] arr, int pivot) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        // l moves inward from left, finds items which are greater than equal pivot
        // r moved inward from right, finds items less than pivot
        // swap items at l and r
        int l = 0, r = n - 1;
        while (l < r) {
            if (arr[r] >= pivot) {
                r--;
            } else if (arr[l] < pivot) {
                l++;
            } else {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        // Now all elements less than pivot are before all elements greater than equal pivot
        // However, pivot is not guaranteed to be before elements greater than pivot

        // Second pass on the right subarray to keep elements greater than pivot to the right of pivot
        l = 0;
        r = n - 1;
        while (l < r) {
            if (arr[l] < pivot) {
                l++;
            } else if (arr[r] > pivot) {
                r--;
            } else {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
    }
}
