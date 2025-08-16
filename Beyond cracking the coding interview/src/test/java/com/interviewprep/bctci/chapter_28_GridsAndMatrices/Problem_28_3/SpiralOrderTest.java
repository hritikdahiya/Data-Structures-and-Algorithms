package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralOrderTest {

    @Test
    public void spiralOrderTest() {
        int[][] expectedSpiralOrder = {
                {16, 17, 18, 19, 20},
                {15, 4, 5, 6, 21},
                {14, 3, 0, 7, 22},
                {13, 2, 1, 8, 23},
                {12, 11, 10, 9, 24}
        };
        int[][] spiralOrder = SpiralOrder.draw(5);
        for (int[] ints : spiralOrder) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        verifyGrid(expectedSpiralOrder, spiralOrder);


        expectedSpiralOrder = new int[][]{
                {4, 5, 6},
                {3, 0, 7},
                {2, 1, 8},
        };
        spiralOrder = SpiralOrder.draw(3);
        verifyGrid(expectedSpiralOrder, spiralOrder);

        expectedSpiralOrder = new int[][]{{0}};
        spiralOrder = SpiralOrder.draw(1);
        verifyGrid(expectedSpiralOrder, spiralOrder);
    }

    @Test
    public void spiralOrderReverseTest() {
        int[][] expectedSpiralOrder = {
                {16, 17, 18, 19, 20},
                {15, 4, 5, 6, 21},
                {14, 3, 0, 7, 22},
                {13, 2, 1, 8, 23},
                {12, 11, 10, 9, 24}
        };
        int[][] spiralOrder = SpiralOrder.drawReverse(5);
        for (int[] ints : spiralOrder) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        verifyGrid(expectedSpiralOrder, spiralOrder);


        expectedSpiralOrder = new int[][]{
                {4, 5, 6},
                {3, 0, 7},
                {2, 1, 8},
        };
        spiralOrder = SpiralOrder.drawReverse(3);
        verifyGrid(expectedSpiralOrder, spiralOrder);

        expectedSpiralOrder = new int[][]{{0}};
        spiralOrder = SpiralOrder.drawReverse(1);
        verifyGrid(expectedSpiralOrder, spiralOrder);
    }

    private void verifyGrid(int[][] expected, int[][] actual) {
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}