package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInSortedArrayTest {
    @Test
    public void elementPresentInArrayReturnsIndexTest() {
        int result = SearchInSortedArray.searchElementInSortedArray(new Integer[]{-2, 0, 3, 4, 7, 9, 11}, 3);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void elementNotPresentInArrayReturnsNegative1Test() {
        int result = SearchInSortedArray.searchElementInSortedArray(new Integer[]{-2, 0, 3, 4, 7, 9, 11}, 2);

        Assertions.assertEquals(-1, result);
    }
}