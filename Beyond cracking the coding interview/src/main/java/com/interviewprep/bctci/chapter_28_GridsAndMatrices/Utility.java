package com.interviewprep.bctci.chapter_28_GridsAndMatrices;

public class Utility {
    public static boolean isWithinBoundsAndHasValue(int[][] board, int r, int c, int val) {
        return isWithinBounds(board, r, c) && board[r][c] == val;
    }

    public static boolean isWithinBounds(int[][] board, int r, int c) {
        int n = board.length;
        if (n == 0) return false;
        int m = board[0].length;
        if (m == 0) return false;

        return r > -1 && r < n && c > -1 && c < m;
    }
}
