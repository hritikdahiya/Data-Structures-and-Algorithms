package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidSudokuTest {
    // empty grid

    @Test
    public void testSudokuValidity() {
        // empty sudoku
        int[][] sudoku = new int[9][9];
        Assertions.assertTrue(ValidSudoku.isValid(sudoku));

        // valid sudoku
        sudoku = new int[][]{
                {5, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 0, 9, 0, 5, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 2, 0, 0, 0},
                {8, 0, 0, 7, 0, 0, 0, 0, 9},
                {0, 0, 2, 0, 0, 0, 8, 0, 0},
                {4, 0, 0, 0, 0, 6, 0, 0, 3},
                {0, 0, 0, 3, 0, 0, 0, 4, 0},
                {0, 0, 3, 0, 8, 0, 2, 0, 0},
                {9, 0, 0, 0, 0, 0, 0, 0, 7}
        };
        Assertions.assertTrue(ValidSudoku.isValid(sudoku));

        // full valid sudoku
        sudoku = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {2, 3, 1, 5, 6, 4, 8, 9, 7},
                {5, 6, 4, 8, 9, 7, 2, 3, 1},
                {8, 9, 7, 2, 3, 1, 5, 6, 4},
                {3, 1, 2, 6, 4, 5, 9, 7, 8},
                {6, 4, 5, 9, 7, 8, 3, 1, 2},
                {9, 7, 8, 3, 1, 2, 6, 4, 5}
        };
        Assertions.assertTrue(ValidSudoku.isValid(sudoku));

        // row duplicate invalid sudoku
        sudoku = new int[][]{
                {5, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 0, 9, 0, 5, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 2, 0, 0, 0},
                {8, 0, 0, 7, 0, 0, 0, 0, 9},
                {0, 0, 2, 0, 0, 0, 8, 0, 0},
                {4, 0, 0, 0, 0, 6, 0, 0, 3},
                {0, 0, 0, 3, 0, 0, 0, 3, 0},    // row duplicate here - 3
                {0, 0, 3, 0, 8, 0, 2, 0, 0},
                {9, 0, 0, 0, 0, 0, 0, 0, 7}
        };
        Assertions.assertFalse(ValidSudoku.isValid(sudoku));

        // column duplicate invalid sudoku
        sudoku = new int[][]{
                {5, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 0, 9, 0, 5, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 2, 0, 0, 0},
                {8, 0, 0, 7, 0, 0, 0, 0, 9},
                {0, 0, 2, 0, 0, 0, 8, 0, 0},
                {4, 0, 0, 0, 0, 6, 0, 0, 3},
                {0, 0, 0, 3, 0, 0, 0, 4, 0},
                {0, 0, 3, 0, 8, 0, 2, 0, 0},
                {9, 0, 0, 0, 0, 0, 3, 0, 7}     // column duplicate here - 3
        };
        Assertions.assertFalse(ValidSudoku.isValid(sudoku));


        // grid duplicate invalid sudoku
        sudoku = new int[][]{
                {5, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 0, 9, 0, 5, 0, 3, 0, 0},
                {0, 3, 0, 0, 0, 2, 0, 0, 0},
                {8, 0, 0, 7, 0, 0, 0, 0, 9},
                {0, 0, 2, 0, 0, 0, 8, 0, 0},
                {4, 0, 0, 0, 0, 6, 0, 0, 3},
                {0, 0, 0, 3, 0, 0, 0, 4, 0},
                {0, 0, 3, 0, 8, 0, 7, 0, 0},
                {9, 0, 0, 0, 0, 0, 0, 0, 7}     // grid duplicate here - 3
        };
        Assertions.assertFalse(ValidSudoku.isValid(sudoku));
    }
}