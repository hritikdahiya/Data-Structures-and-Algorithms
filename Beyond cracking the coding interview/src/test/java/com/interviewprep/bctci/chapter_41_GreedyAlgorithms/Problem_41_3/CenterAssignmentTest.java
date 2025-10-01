package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CenterAssignmentTest {

    @Test
    public void findMinSumOfDistancesFromCenterTest() {
        float[][] points = new float[][]{
                new float[]{0, 1},
                new float[]{1, 0},
                new float[]{-1, 0},
                new float[]{0, -1}
        };
        float[] center1 = new float[]{0, 0};
        float[] center2 = new float[]{1, 1};
        float expected = 4;
        Assertions.assertEquals(expected, CenterAssignment.findMinSumOfDistancesFromCenter(points, center1, center2));

        points = new float[][]{
                new float[]{0, 0},
                new float[]{0, 0}
        };
        center1 = new float[]{0, 0};
        center2 = new float[]{1, 1};
        expected = 1.4142135f;
        Assertions.assertEquals(expected, CenterAssignment.findMinSumOfDistancesFromCenter(points, center1, center2));

        points = new float[][]{
                new float[]{0, 0.5f},
                new float[]{1, 0.5f}
        };
        center1 = new float[]{0, 0};
        center2 = new float[]{1, 1};
        expected = 1f;
        Assertions.assertEquals(expected, CenterAssignment.findMinSumOfDistancesFromCenter(points, center1, center2));
    }
}