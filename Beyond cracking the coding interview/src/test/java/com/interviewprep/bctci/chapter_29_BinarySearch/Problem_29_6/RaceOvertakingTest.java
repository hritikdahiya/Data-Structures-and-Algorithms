package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RaceOvertakingTest {
    @Test
    public void player1AlwaysAheadTest() {
        int[] p1 = new int[]{3, 4, 5, 6, 7};
        int[] p2 = new int[]{2, 3, 4, 5, 6};

        Assertions.assertEquals(p1.length, RaceOvertaking.findOvertakingPoint(p1, p2));
    }

    @Test
    public void player1AlwaysBehindTest() {
        int[] p1 = new int[]{2, 3, 4, 5, 6};
        int[] p2 = new int[]{3, 4, 5, 6, 7};

        Assertions.assertEquals(0, RaceOvertaking.findOvertakingPoint(p1, p2));
    }

    @Test
    public void player2OvertookPlayer1MidRaceTest() {
        int[] p1 = new int[]{2, 4, 6, 8, 10};
        int[] p2 = new int[]{1, 3, 7, 9, 11};

        Assertions.assertEquals(2, RaceOvertaking.findOvertakingPoint(p1, p2));
    }
}