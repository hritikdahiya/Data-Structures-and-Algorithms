package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_7;

import static com.interviewprep.bctci.chapter_28_GridsAndMatrices.Utility.isWithinBounds;

public class SubgridSums {
    public static int[][] findSubgridSums(int[][] grid) {
        if (grid.length == 0) {
            return new int[0][];
        }

        int R = grid.length, C = grid[0].length;
        int[][] subgridSums = new int[R][C];
        for (int r = R - 1; r > -1; r--) {
            for (int c = C - 1; c > -1; c--) {
                int downNeighborMaximums = isWithinBounds(grid, r + 1, c) ? subgridSums[r + 1][c] : 0;
                int rightNeighborMaximums = isWithinBounds(grid, r, c + 1) ? subgridSums[r][c + 1] : 0;
                int bottomRightDiagonalNeighbor = isWithinBounds(grid, r + 1, c + 1) ? subgridSums[r + 1][c + 1] : 0;

                subgridSums[r][c] = grid[r][c] + downNeighborMaximums + rightNeighborMaximums - bottomRightDiagonalNeighbor;
            }
        }

        return subgridSums;
    }
}
