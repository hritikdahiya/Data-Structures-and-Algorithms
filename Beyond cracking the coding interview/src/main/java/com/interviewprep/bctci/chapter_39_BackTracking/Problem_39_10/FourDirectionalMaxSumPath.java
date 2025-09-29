package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourDirectionalMaxSumPath {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private List<Integer[]> maxSumPath;
    private Integer maxSum;

    public List<Integer[]> maxSum(int[][] grid) {
        maxSumPath = new ArrayList<>();
        maxSum = Integer.MIN_VALUE;

        int R = grid.length;
        if (R < 1) {
            return new ArrayList<>();
        }
        int C = grid[0].length;
        Set<String> visited = new HashSet<>();

        maxSumPathHelper(grid, 0, 0, R, C, 0, new ArrayList<>(), visited);

        return maxSumPath;
    }

    private void maxSumPathHelper(int[][] grid, int r, int c, int R, int C, int sum, ArrayList<Integer[]> currPath, Set<String> visited) {
        Integer[] currNode = new Integer[]{r, c};
        String currNodeStr = r + ", " + c;

        // base case - handle out of bounds or already visited
        if (r < 0 || r >= R || c < 0 || c >= C || visited.contains(currNodeStr)) {
            return;
        }

        visited.add(currNodeStr);
        sum += grid[r][c];
        currPath.add(currNode);

        // base case - reached target
        if (r == R - 1 && c == C - 1) {
            if (sum > maxSum) {
                maxSum = sum;
                maxSumPath = List.copyOf(currPath);
            }

            // clean up
            visited.remove(currNodeStr);
            currPath.remove(currPath.size() - 1);

            return;
        }

        // search in all directions
        for (int[] dir : DIRECTIONS) {
            int newR = r + dir[0], newC = c + dir[1];
            maxSumPathHelper(grid, newR, newC, R, C, sum, currPath, visited);
        }

        // clean up
        visited.remove(currNodeStr);
        currPath.remove(currPath.size() - 1);
    }

}
