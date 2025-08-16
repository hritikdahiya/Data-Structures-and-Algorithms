package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_1;

public class SearchInSortedArray {
    public static <T extends Comparable<T>> int searchElementInSortedArray(final T[] arr, final T target) {
        if (arr.length == 0) {
            return -1;
        }

        int startIndex = 0, endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            // int overflow conscious way of calculating (startIndex + endIndex)/2
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            int compareValue = arr[midIndex].compareTo(target);
            if (compareValue > 0) {
                // mid-element is greater than target ==> search the left subarray (searchIndex - (midIndex - 1))
                endIndex = midIndex - 1;
            } else if (compareValue < 0) {
                // mid-element is less than target ==> search the right subarray ((midIndex + 1) - rightIndex]
                startIndex = midIndex + 1;
            } else {
                // Found target
                return midIndex;
            }
        }

        // if reached here ==> element does not exist
        return -1;
    }
}
