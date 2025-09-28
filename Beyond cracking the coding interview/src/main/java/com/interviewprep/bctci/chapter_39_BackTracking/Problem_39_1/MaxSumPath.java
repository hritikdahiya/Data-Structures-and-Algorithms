package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_1;

import java.util.Arrays;

public class MaxSumPath {
    private static final int[][] DIRECTION = {{1, 0}, {0, 1}};

    public static int find(int[][] grid) {
        int R = grid.length;
        if (R < 1) {
            return 0;
        }
        int C = grid[0].length;

        int[][] memo = new int[R][C];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        find(grid, 0, 0, R, C, memo);

        return memo[0][0];
    }

    private static int find(int[][] grid, int r, int c, int R, int C, int[][] memo) {
        if (r >= R || c >= C) {
            return 0;
        }
        if (r == R - 1 && c == C - 1) {
            memo[r][c] = grid[r][c];
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int maxPath = 0;
        for (int[] dir : DIRECTION) {
            int nextR = r + dir[0], nextC = c + dir[1];
            maxPath = Math.max(maxPath, grid[r][c] + find(grid, nextR, nextC, R, C, memo));
        }

        memo[r][c] = maxPath;
        return maxPath;
    }
}
