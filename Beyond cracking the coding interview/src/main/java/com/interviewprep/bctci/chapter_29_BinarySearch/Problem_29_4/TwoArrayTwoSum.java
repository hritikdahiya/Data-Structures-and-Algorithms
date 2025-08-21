package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_4;

public class TwoArrayTwoSum {
    // Binary Search solution with Transition Point
    public static int[] find2SumIndices(int[] sorted_arr, int[] unsorted_arr) {
        if (sorted_arr.length == 0 || unsorted_arr.length == 0) {
            throw new IllegalArgumentException();
        }

        // For every element e in unsorted array, find if -e exists in sorted array (using binary search)
        for (int i = 0; i < unsorted_arr.length; i++) {
            int ele = unsorted_arr[i];
            int eleToFind = -1 * ele;
            int s = 0, e = sorted_arr.length - 1;

            // Fail fast
            // the element is out of the sorted Array range, we won't find it.
            if (sorted_arr[s] > eleToFind || sorted_arr[e] < eleToFind) {
                continue;
            }
            if (sorted_arr[s] == eleToFind) {
                return new int[]{s, i};
            }

            while (e - s > 1) {
                // while the ends are not near each other
                int mid = s + (e - s) / 2;

                if (sorted_arr[mid] < eleToFind) {
                    // search right subarray
                    s = mid;
                } else {
                    // search left subarray
                    e = mid;
                }
            }

            if (sorted_arr[e] == eleToFind) {
                return new int[]{e, i};
            }
        }

        // If 2 sum  doesn't exist
        return new int[]{-1, -1};
    }
}
