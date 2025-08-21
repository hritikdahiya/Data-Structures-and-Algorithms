package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_5;

public class TargetCountDivisibleByK {

    public static boolean findTargetCountDivisibleByK(int[] sorted_arr, int target, int K) {
        if (sorted_arr.length == 0) {
            return true;
        }

        int firstOccurrenceOfTarget = findFirstOccurrenceOfElement(sorted_arr, target);
        if (firstOccurrenceOfTarget == -1) {
            // element doesn't exist ==> 0 occurrences
            return true;
        }
        int lastOccurrenceOfTarget = findLastOccurrenceOfElement(sorted_arr, target);

        int elementCount = lastOccurrenceOfTarget - firstOccurrenceOfTarget + 1;
        return elementCount % K == 0;
    }

    private static int findFirstOccurrenceOfElement(int[] sorted_arr, int ele) {
        // Transition point: index where elements 'before' TP are smaller than x
        int s = 0, e = sorted_arr.length - 1;
        if(ele < sorted_arr[0] || ele > sorted_arr[e]) {
            return -1;
        }
        // If element at the start, it is the first occurrence
        if(sorted_arr[s] == ele) {
            return s;
        }

        // While s and e are not next to each other
        while (e - s > 1) {
            int mid = s + (e - s) / 2;
            if (sorted_arr[mid] < ele) {
                // Mid is Before TP
                s = mid;
            } else {
                // mid is After TP
                e = mid;
            }
        }

        // Binary search ends with s and e right next to each other (s in before region, e in after)
        // if ele exists, it's first occurrence is in the after region at e
        return sorted_arr[e] == ele ? e : -1;
    }

    private static int findLastOccurrenceOfElement(int[] sorted_arr, int ele) {
        // Transition point: index where elements 'before' TP are smaller than ele + 1
        int s = 0, e = sorted_arr.length - 1;
        if(ele < sorted_arr[0] || ele > sorted_arr[e]) {
            return -1;
        }
        // If element at the end, it is the last occurrence
        if(sorted_arr[e] == ele) {
            return e;
        }

        // While s and e are not next to each other
        while (e - s > 1) {
            int mid = s + (e - s) / 2;
            if (sorted_arr[mid] < ele + 1) {
                // Mid is Before TP
                s = mid;
            } else {
                // mid is After TP
                e = mid;
            }
        }

        // Binary search ends with s and e right next to each other (s in before region, e in after)
        // if ele exists, it's last occurrence is in the before region at s
        return sorted_arr[s] == ele ? s : -1;
    }
}
