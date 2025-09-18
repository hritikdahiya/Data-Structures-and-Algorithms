package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.Integer.MIN_VALUE;

public class MultiExitMaze {
    private static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static int[][] findNearestExitPerCell(List<String> mazeRows) {
        int R = mazeRows.size();
        if (R < 1) {
            return new int[0][];
        }
        int C = mazeRows.get(0).length();
        if (C < 1) {
            return new int[0][];
        }

        int[][] distances = new int[R][C];
        for (int[] row : distances) {
            Arrays.fill(row, MIN_VALUE);
        }

        Queue<Cell> bfsQueue = new LinkedList<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (mazeRows.get(r).charAt(c) == 'O') {
                    distances[r][c] = 0;
                    bfsQueue.add(new Cell(r, c, 0));
                } else if (mazeRows.get(r).charAt(c) == 'X') {
                    distances[r][c] = -1;
                }
            }
        }

        while (!bfsQueue.isEmpty()) {
            Cell cell = bfsQueue.poll();
            int r = cell.r(), c = cell.c(), dist = cell.dist();

            for (int[] step : dir) {
                int newR = r + step[0], newC = c + step[1];
                if (isWalkableCell(mazeRows, distances, newR, newC, R, C)) {
                    distances[newR][newC] = dist + 1;
                    bfsQueue.add(new Cell(newR, newC, dist + 1));
                }
            }
        }

        return distances;
    }

    private static boolean isWalkableCell(List<String> mazeRows, int[][] distances, int r, int c, int R, int C) {
        return r > -1 && r < R && c > -1 && c < C && mazeRows.get(r).charAt(c) == '.' && distances[r][c] == MIN_VALUE;
    }
}
