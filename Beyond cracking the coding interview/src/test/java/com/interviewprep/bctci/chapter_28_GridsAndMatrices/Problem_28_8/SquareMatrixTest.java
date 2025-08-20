package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareMatrixTest {

    @Test
    public void transposeTest() {
        double[][] grid = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[][] transposedGrid = {
                {1.0, 3.0},
                {2.0, 4.0}
        };
        SquareMatrix matrix = new SquareMatrix(grid);
        matrix.transpose();
        verifyResult(transposedGrid, matrix.getGrid());
    }

    @Test
    public void rotateClockWiseTest() {
        double[][] grid = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[][] horizontallyRotatedGrid = {
                {3.0, 1.0},
                {4.0, 2.0}
        };
        SquareMatrix matrix = new SquareMatrix(grid);
        matrix.rotateClockWise();
        verifyResult(horizontallyRotatedGrid, matrix.getGrid());
    }

    @Test
    public void antiClockWiseTest() {
        double[][] grid = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[][] horizontallyRotatedGrid = {
                {2.0, 4.0},
                {1.0, 3.0}
        };
        SquareMatrix matrix = new SquareMatrix(grid);
        matrix.rotateAntiClockWise();
        verifyResult(horizontallyRotatedGrid, matrix.getGrid());
    }

    @Test
    public void reflectHorizontallyTest() {
        double[][] grid = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[][] horizontallyReflectedGrid = {
                {2.0, 1.0},
                {4.0, 3.0}
        };
        SquareMatrix matrix = new SquareMatrix(grid);
        matrix.reflectHorizontally();
        verifyResult(horizontallyReflectedGrid, matrix.getGrid());
    }

    @Test
    public void reflectVerticallyTest() {
        double[][] grid = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[][] verticallyReflectedGrid = {
                {3.0, 4.0},
                {1.0, 2.0}
        };
        SquareMatrix matrix = new SquareMatrix(grid);
        matrix.reflectVertically();
        verifyResult(verticallyReflectedGrid, matrix.getGrid());
    }

    private void verifyResult(double[][] expected, double[][] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}