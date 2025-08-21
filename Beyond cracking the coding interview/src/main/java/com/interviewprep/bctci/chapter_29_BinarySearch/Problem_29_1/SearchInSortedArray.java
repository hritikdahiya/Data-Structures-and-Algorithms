package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_1;

public class SearchInSortedArray {
    public static <T extends Comparable<T>> int searchElementInSortedArray(final T[] arr, final T target) {
        if (arr.length == 0) {
            return -1;
        }

        // target out of arr's range
        if(arr[0].compareTo(target) > 0 || arr[arr.length - 1].compareTo(target) < 0) {
            return -1;
        }

        // target is at first index
        if(arr[0].compareTo(target) == 0) {
            return 0;
        }

        int startIndex = 0, endIndex = arr.length - 1;
        while (endIndex - startIndex > 1) {
            // int overflow conscious way of calculating (startIndex + endIndex)/2
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            int compareValue = arr[midIndex].compareTo(target);
            // midIndex is in before region (i.e. elements at midIndex is strictly less than target)
            // move startIndex towards mid
            if (compareValue < 0) {
                startIndex = midIndex;
            } else {
                // move endIndex towards mid
                endIndex = midIndex;
            }
        }

        // if reached here ==> element does not exist
        return arr[endIndex].compareTo(target) == 0 ? endIndex : -1;
    }
}
