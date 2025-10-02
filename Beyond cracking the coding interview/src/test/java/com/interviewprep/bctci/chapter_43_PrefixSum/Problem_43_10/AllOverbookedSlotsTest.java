package com.interviewprep.bctci.chapter_43_PrefixSum.Problem_43_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AllOverbookedSlotsTest {

    @Test
    public void findCountOfOverbookedSlotsTest() {
        int[] slots = new int[6];
        int[][] bookings = new int[][]{
                new int[]{0, 3, 4},
                new int[]{2, 5, 1},
                new int[]{4, 4, 3}
        };
        int cap = 5;
        int expected = 0;
        Assertions.assertEquals(expected, AllOverbookedSlots.findCountOfOverbookedSlots(slots, bookings, cap));


        slots = new int[]{1, 1, 0, 0, 2, 3};
        bookings = new int[][]{
                new int[]{0, 3, 4},
                new int[]{2, 5, 1},
                new int[]{4, 4, 3}
        };
        cap = 4;
        expected = 5;
        Assertions.assertEquals(expected, AllOverbookedSlots.findCountOfOverbookedSlots(slots, bookings, cap));
    }
}