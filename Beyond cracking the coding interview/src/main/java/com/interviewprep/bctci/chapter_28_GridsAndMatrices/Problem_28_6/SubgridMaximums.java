package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_6;

import static com.interviewprep.bctci.chapter_28_GridsAndMatrices.Utility.isWithinBounds;

public class SubgridMaximums {
    public static int[][] getSubgridMaximums(int[][] grid) {
        if (grid.length == 0) {
            return new int[0][];
        }

        int R = grid.length, C = grid[0].length;
        int[][] subgridMaximums = new int[R][C];
        for (int r = R - 1; r > -1; r--) {
            for (int c = C - 1; c > -1; c--) {
                int downNeighborMaximums = isWithinBounds(grid, r + 1, c) ? subgridMaximums[r + 1][c] : Integer.MIN_VALUE;
                int rightNeighborMaximums = isWithinBounds(grid, r, c + 1) ? subgridMaximums[r][c + 1] : Integer.MIN_VALUE;

                subgridMaximums[r][c] = Math.max(grid[r][c], Math.max(rightNeighborMaximums, downNeighborMaximums));
            }
        }

        return subgridMaximums;
    }
}
