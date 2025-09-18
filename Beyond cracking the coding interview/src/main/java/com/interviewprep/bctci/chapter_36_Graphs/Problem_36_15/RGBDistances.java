package com.interviewprep.bctci.chapter_36_Graphs.Problem_36_15;

import com.interviewprep.bctci.chapter_36_Graphs.Problem_36_14.Cell;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RGBDistances {
    private static final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int[][] calculate(List<String> screen) {
        int R = screen.size();
        if (R < 1) {
            return new int[0][];
        }
        int C = screen.get(0).length();
        if (C < 1) {
            return new int[0][];
        }

        int[][] manhattanDist = new int[R][C];

        // find distances of every R character to it's nearest G
        findNearestDistance(screen, R, C, 'R', 'G', manhattanDist);
        // find distances of every G character to it's nearest B
        findNearestDistance(screen, R, C, 'G', 'B', manhattanDist);
        // find distances of every B character to it's nearest R
        findNearestDistance(screen, R, C, 'B', 'R', manhattanDist);

        return manhattanDist;
    }

    private static void findNearestDistance(List<String> screen, int R, int C, char sourceChar, char destinationChar, int[][] manhattanDist) {
        int[][] dist = new int[R][C];
        Queue<Cell> bfsQueue = new LinkedList<>();
        // initialize the queue with destination char to start BFS from
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (screen.get(i).charAt(j) == destinationChar) {
                    bfsQueue.add(new Cell(i, j, 0));
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = -1;
                }
            }
        }

        // perform BFS and find the nearest distance of every character from destination
        multisourceBfs(R, C, bfsQueue, dist);

        // for every source character, store its answer in the final manhattanDist output arrau
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                manhattanDist[i][j] = screen.get(i).charAt(j) == sourceChar ? dist[i][j] : manhattanDist[i][j];
            }
        }
    }

    private static void multisourceBfs(int R, int C, Queue<Cell> bfsQueue, int[][] distance) {
        while (!bfsQueue.isEmpty()) {
            Cell cell = bfsQueue.poll();
            int r = cell.r(), c = cell.c(), dist = cell.dist();

            for (int[] step : dir) {
                int newR = r + step[0], newC = c + step[1];
                if (isValid(newR, newC, R, C, distance)) {
                    distance[newR][newC] = dist + 1;
                    bfsQueue.add(new Cell(newR, newC, dist + 1));
                }
            }
        }
    }

    private static boolean isValid(int r, int c, int R, int C, int[][] distance) {
        return r > -1 && r < R && c > -1 && c < C && distance[r][c] == -1;
    }
}
