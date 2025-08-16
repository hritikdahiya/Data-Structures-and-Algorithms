package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_2;

import java.util.Arrays;

import static com.interviewprep.bctci.chapter_28_GridsAndMatrices.Utility.isWithinBoundsAndHasValue;

public class QueensReach {
    private static final int[][] queenDirections = {{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};

    public static int[][] findReach(int[][] board) {
        if (board.length == 0 || board[0].length == 0) {
            return new int[0][];
        }

        int n = board.length, m = board[0].length;
        int[][] result = new int[n][m];
        for (int[] resultRow : result) {
            Arrays.fill(resultRow, 0);
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                // Find a queen on board
                if (board[row][col] == 1) {
                    // Queen found at [row, col]
                    result[row][col] = 1;

                    // Look in all directions the queen can take
                    for (int[] dir : queenDirections) {
                        int r = row + dir[0];
                        int c = col + dir[1];
                        // go all the way in any direction (since queen can jump more than 1 spot in any direction
                        while (isWithinBoundsAndHasValue(board, r, c, 0)) {
                            // mark the result array with 1 if queen can reach it
                            result[r][c] = 1;
                            r += dir[0];
                            c += dir[1];
                        }
                    }
                }
            }
        }

        return result;
    }
}
