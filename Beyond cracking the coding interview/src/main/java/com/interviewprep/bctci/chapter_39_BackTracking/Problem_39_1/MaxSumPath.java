package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_1;

public class MaxSumPath {
    private static final int[][] DIRECTION = {{1, 0}, {0, 1}};

    public static int find(int[][] grid) {
        int R = grid.length;
        if (R < 1) {
            return 0;
        }
        int C = grid[0].length;
        return find(grid, 0, 0, R, C);
    }

    private static int find(int[][] grid, int r, int c, int R, int C) {
        if (r >= R || c >= C) {
            return 0;
        }
        if (r == R - 1 && c == C - 1) {
            return grid[r][c];
        }

        int maxPath = 0;
        for (int[] dir : DIRECTION) {
            int nextR = r + dir[0], nextC = c + dir[1];
            maxPath = Math.max(maxPath, grid[r][c] + find(grid, nextR, nextC, R, C));
        }

        return maxPath;
    }
}
