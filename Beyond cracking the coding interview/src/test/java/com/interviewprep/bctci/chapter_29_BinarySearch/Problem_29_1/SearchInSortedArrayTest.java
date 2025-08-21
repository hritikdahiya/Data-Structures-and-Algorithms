package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInSortedArrayTest {
    @Test
    public void elementPresentInArrayReturnsIndexTest() {
        Integer[] arr = new Integer[]{-2, 0, 3, 4, 7, 9, 11};
        int target = 3;
        Assertions.assertEquals(2, SearchInSortedArray.searchElementInSortedArray(arr, target));

        target = -2;
        Assertions.assertEquals(0, SearchInSortedArray.searchElementInSortedArray(arr, target));

    }

    @Test
    public void elementNotPresentInArrayReturnsNegative1Test() {
        Integer[] arr = new Integer[]{-2, 0, 3, 4, 7, 9, 11};
        int target = 2;
        Assertions.assertEquals(-1, SearchInSortedArray.searchElementInSortedArray(arr, target));

        target = -10;
        Assertions.assertEquals(-1, SearchInSortedArray.searchElementInSortedArray(arr, target));

        target = 20;
        Assertions.assertEquals(-1, SearchInSortedArray.searchElementInSortedArray(arr, target));
    }
}