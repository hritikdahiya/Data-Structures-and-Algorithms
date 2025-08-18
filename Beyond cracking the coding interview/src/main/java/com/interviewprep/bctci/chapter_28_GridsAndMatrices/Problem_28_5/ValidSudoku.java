package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_5;

public class ValidSudoku {
    public static boolean isValid(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (!isValidPosition(sudoku, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidPosition(int[][] sudoku, int r, int c) {
        int currVal = sudoku[r][c];
        // do  nothing if the position is not filled (i.e. value = 0)
        if (currVal == 0) {
            return true;
        }

        // check row validity
        for (int col = 0; col < sudoku[r].length; col++) {
            if (col != c && sudoku[r][col] == currVal) {
                return false;
            }
        }

        // check column validity
        for (int row = 0; row < sudoku.length; row++) {
            if (row != r && sudoku[row][c] == currVal) {
                return false;
            }
        }

        // check the 3 X 3 grid validity
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // the grid that current r, c fall into is has the
                // top left index - 3 * floor(r/3)
                // bottom right index - 3 * floor(c/3)
                int xCoordinate = 3 * Math.floorDiv(r, 3) + row;
                int yCoordinate = 3 * Math.floorDiv(c, 3) + col;
                if (xCoordinate != r && yCoordinate != c && sudoku[xCoordinate][yCoordinate] == currVal) {
                    return false;
                }
            }
        }

        return true;
    }
}
