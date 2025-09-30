package com.interviewprep.bctci.chapter_40_DynamicProgramming.Problem_40_4;

import java.util.Arrays;

public class Count0SumPaths {
    private int[][] dp;

    public int countMemoization(int[][] grid) {
        int R = grid.length;
        if (R < 1) {
            return 0;
        }
        int C = grid[0].length;

        dp = new int[R][C];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return countMemoizationHelper(grid, 0, 0, R, C);
    }


    private int countMemoizationHelper(int[][] grid, int r, int c, int R, int C) {
        if (r == R - 1 && c == C - 1) {
            // reached end
            return grid[r][c] == 0 ? 1 : 0;
        }

        if (grid[r][c] == 1) {
            return 0;
        }

        if (dp[r][c] > -1) {
            return dp[r][c];
        }

        dp[r][c] = 0;
        if (r + 1 < R) {
            dp[r][c] += countMemoizationHelper(grid, r + 1, c, R, C);
        }
        if (c + 1 < C) {
            dp[r][c] += countMemoizationHelper(grid, r, c + 1, R, C);
        }
        if (r + 1 < R && c + 1 < C) {
            dp[r][c] += countMemoizationHelper(grid, r + 1, c + 1, R, C);
        }

        return dp[r][c];
    }

}
