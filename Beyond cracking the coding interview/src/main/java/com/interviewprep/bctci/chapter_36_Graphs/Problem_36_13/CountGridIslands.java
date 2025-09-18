package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_13;

import java.util.Arrays;

public class CountGridIslands {
    private static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int numOfIslands(int[][] grid) {
        int R = grid.length;
        if (R < 1) {
            return 0;
        }
        int C = grid[0].length;
        if (C < 1) {
            return 0;
        }

        int[][] visited = new int[R][C];
        for (int[] row : visited) {
            Arrays.fill(row, 0);
        }

        int islandCount = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (isValid(grid, visited, r, c, R, C)) {
                    islandCount++;
                    dfs(grid, r, c, R, C, visited); // or BFS
                }
            }
        }
        return islandCount;
    }

    private static void dfs(int[][] grid, int r, int c, int R, int C, int[][] visited) {
        visited[r][c] = 1;
        for (int[] step : dir) {
            int newR = r + step[0], newC = c + step[1];
            if (isValid(grid, visited, newR, newC, R, C)) {
                dfs(grid, newR, newC, R, C, visited);
            }
        }
    }

    private static boolean isValid(int[][] grid, int[][] visited, int r, int c, int R, int C) {
        return r > -1 && r < R && c > -1 && c < C && grid[r][c] == 1 && visited[r][c] == 0;
    }
}
