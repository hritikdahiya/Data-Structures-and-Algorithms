package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValleyBottomTest {
    @Test
    public void sortedArrayAscEdgeCaseTest() {
        Assertions.assertEquals(4, ValleyBottom.findValleyBottom(new int[]{4, 5}));
        Assertions.assertEquals(1, ValleyBottom.findValleyBottom(new int[]{1, 4, 7, 10}));
    }

    @Test
    public void sortedArrayDescEdgeCaseTest() {
        Assertions.assertEquals(5, ValleyBottom.findValleyBottom(new int[]{6, 5}));
        Assertions.assertEquals(3, ValleyBottom.findValleyBottom(new int[]{6, 5, 4, 3}));
    }

    @Test
    public void genericValleyTestCase() {
        Assertions.assertEquals(4, ValleyBottom.findValleyBottom(new int[]{6, 5, 4, 7, 9}));

    }
}