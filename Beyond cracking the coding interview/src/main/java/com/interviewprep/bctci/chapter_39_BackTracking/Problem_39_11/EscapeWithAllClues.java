package com.interviewprep.bctci.chapter_39_BackTracking.Problem_39_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EscapeWithAllClues {
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private List<Integer[]> shortestPath;

    public List<Integer[]> findPath(int[][] room) {
        shortestPath = new ArrayList<>();

        int R = room.length;
        if (R < 1) {
            return new ArrayList<>();
        }
        int C = room[0].length;
        int clues = 0;
        for (int[] row : room) {
            for (int cell : row) {
                if (cell == 2) {
                    clues++;
                }
            }
        }

        Set<String> visited = new HashSet<>();
        helper(room, 0, 0, R, C, 0, clues, new ArrayList<>(), visited);

        return shortestPath;
    }

    private void helper(int[][] room, int r, int c, int R, int C, int cluesCollected, int totalClues, List<Integer[]> currPath, Set<String> visited) {
        String key = r + "," + c;
        // out of bounds, or
        // met and obstacle, or
        // already visited
        if (!isWithinBounds(r, c, R, C) || room[r][c] == 1 || visited.contains(key)) {
            return;
        }

        visited.add(key);
        currPath.add(new Integer[]{r, c});

        if (room[r][c] == 2) {
            cluesCollected++;
        }
        if (cluesCollected == totalClues) {
            if (shortestPath.isEmpty() || currPath.size() < shortestPath.size()) {
                shortestPath = List.copyOf(currPath);
            }
            visited.remove(key);
            currPath.remove(currPath.size() - 1);
            return;
        }


        for (int[] dir : DIRECTIONS) {
            int newR = r + dir[0], newC = c + dir[1];
            helper(room, newR, newC, R, C, cluesCollected, totalClues, currPath, visited);
        }

        visited.remove(key);
        currPath.remove(currPath.size() - 1);
    }

    private boolean isWithinBounds(int r, int c, int R, int C) {
        return r > -1 && c > -1 && r < R && c < C;
    }


}
