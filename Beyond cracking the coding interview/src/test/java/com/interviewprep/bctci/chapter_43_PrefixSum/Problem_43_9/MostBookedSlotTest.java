package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostBookedSlotTest {

    @Test
    public void findMostBookedSlotTest() {
        int[] slots = new int[6];
        int[][] bookings = new int[][]{
                new int[]{0, 3, 4},
                new int[]{2, 5, 1},
                new int[]{4, 4, 3}
        };
        int expected = 2;
        Assertions.assertEquals(expected, MostBookedSlot.findMostBookedSlot(slots, bookings));


        slots = new int[]{1, 1, 0, 0, 2, 3};
        bookings = new int[][]{
                new int[]{0, 3, 4},
                new int[]{2, 5, 1},
                new int[]{4, 4, 3}
        };
        expected = 4;
        Assertions.assertEquals(expected, MostBookedSlot.findMostBookedSlot(slots, bookings));
    }
}