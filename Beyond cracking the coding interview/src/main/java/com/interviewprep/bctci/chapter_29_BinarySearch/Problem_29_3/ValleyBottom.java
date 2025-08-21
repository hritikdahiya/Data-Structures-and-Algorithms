package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_3;

public class ValleyBottom {
    // Binary Search solution with Transition Point
    public static int findValleyBottom(int[] arr) {
        if (arr.length < 2) {
            // For a non-empty desc prefix array and non-empty asc suffix to exist, there must be 2 elements present
            throw new IllegalArgumentException();
        }

        // Using transition point recipe - Transition point where all elements to the left of it are descending
        int s = 0, e = arr.length - 1;

        // Edge case - when the entire arr is sorted desc i.e. only the last element counts as the asc suffix
        if (isBefore(arr, e)) {
            return arr[e];
        }

        // while the ends are not near each other
        while (e - s > 1) {
            int mid = s + (e - s) / 2;

            if (isBefore(arr, mid)) {
                // If mid is before TP, mid is in the desc prefix array
                s = mid;
            } else {
                // If mid is after TP, mid is in the asc suffix array
                e = mid;
            }
        }

        return arr[s];
    }

    // Is the current element greater than it's previous element i.e. in the desc prefix
    private static boolean isBefore(int[] arr, int index) {
        return index == 0 || arr[index] < arr[index - 1];
    }
}
