package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValleyBottomTest {
    @Test
    public void sortedArrayAscEdgeCaseTest() {
        ValleyBottom vb = new ValleyBottom();

        Assertions.assertEquals(4, vb.findValleyBottom(new int[]{4, 5}));
        Assertions.assertEquals(1, vb.findValleyBottom(new int[]{1, 4, 7, 10}));
    }

    @Test
    public void sortedArrayDescEdgeCaseTest() {
        ValleyBottom vb = new ValleyBottom();

        Assertions.assertEquals(5, vb.findValleyBottom(new int[]{6, 5}));
        Assertions.assertEquals(3, vb.findValleyBottom(new int[]{6, 5, 4, 3}));
    }

    @Test
    public void genericValleyTestCase() {
        ValleyBottom vb = new ValleyBottom();

        Assertions.assertEquals(4, vb.findValleyBottom(new int[]{6, 5, 4, 7, 9}));

    }
}