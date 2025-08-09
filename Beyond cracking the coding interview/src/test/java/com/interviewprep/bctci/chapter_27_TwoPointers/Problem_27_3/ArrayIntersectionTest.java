package com.interviewprep.bctci.chapter_27_TwoPointers.Problem_27_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayIntersectionTest {
    @Test
    public void testArrayIntersection() {
        // Either array empty
        Assertions.assertArrayEquals(new Integer[0], ArrayIntersection.findArrayIntersection(new int[0], new int[5]));

        // no common elements
        Assertions.assertArrayEquals(new Integer[0], ArrayIntersection.findArrayIntersection(new int[]{1, 3, 5}, new int[]{2, 4, 6, 8, 10}));

        // Happy path
        Assertions.assertArrayEquals(new Integer[]{1, 1}, ArrayIntersection.findArrayIntersection(new int[]{1, 1, 1}, new int[]{1, 1}));
        Assertions.assertArrayEquals(new Integer[]{1, 5}, ArrayIntersection.findArrayIntersection(new int[]{1, 3, 5}, new int[]{1, 5}));
    }
}