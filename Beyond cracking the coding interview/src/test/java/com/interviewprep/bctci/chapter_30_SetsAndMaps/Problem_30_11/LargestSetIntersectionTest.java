package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestSetIntersectionTest {

    @Test
    public void findIndexTest() {
        // only one set
        int[][] sets = new int[][]{
                {1, 2, 3}
        };
        Assertions.assertEquals(0, LargestSetIntersection.findSetToRemove(sets));

        // 2 sets
        sets = new int[][]{
                {1, 2, 3},
                {1, 2}
        };
        Assertions.assertEquals(1, LargestSetIntersection.findSetToRemove(sets));

        sets = new int[][]{
                {1, 2, 3},
                {3, 1, 2},
                {1, 4, 5},
                {1, 2}
        };
        Assertions.assertEquals(2, LargestSetIntersection.findSetToRemove(sets));
    }
}