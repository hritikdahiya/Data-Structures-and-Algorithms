package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntervalIntersectionTest {

    @Test
    public void findIntervalIntersectionTest() {
        // common test case
        int[][] arr1 = new int[][]{new int[]{0, 1}, new int[]{4, 6}, new int[]{7, 8}};
        int[][] arr2 = new int[][]{new int[]{2, 3}, new int[]{5, 9}, new int[]{10, 11}};
        Integer[][] intersection = new Integer[][]{new Integer[]{5, 6}, new Integer[]{7, 8}};

        Integer[][] result = IntervalIntersection.findIntervalIntersection(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            Assertions.assertArrayEquals(intersection[i], result[i]);
        }


        arr1 = new int[][]{new int[]{2, 4}, new int[]{5, 8}};
        arr2 = new int[][]{new int[]{3, 3}, new int[]{4, 7}};
        intersection = new Integer[][]{new Integer[]{3, 3}, new Integer[]{4, 4}, new Integer[]{5, 7}};

        result = IntervalIntersection.findIntervalIntersection(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            Assertions.assertArrayEquals(intersection[i], result[i]);
        }

        // empty array
        arr1 = new int[0][];
        arr2 = new int[][]{new int[]{3, 3}, new int[]{4, 7}};

        result = IntervalIntersection.findIntervalIntersection(arr1, arr2);
        Assertions.assertEquals(0, result.length);


        // NO overlap
        arr1 = new int[][]{new int[]{2, 4}, new int[]{5, 8}};
        arr2 = new int[][]{new int[]{0, 1}, new int[]{9, 10}};

        result = IntervalIntersection.findIntervalIntersection(arr1, arr2);
        Assertions.assertEquals(0, result.length);

    }
}