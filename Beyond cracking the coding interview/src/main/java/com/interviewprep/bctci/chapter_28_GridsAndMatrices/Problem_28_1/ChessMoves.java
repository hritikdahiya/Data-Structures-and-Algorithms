package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_1;

import java.util.ArrayList;
import java.util.List;

public class ChessMoves {
    private static final int[][] kingDirections = {{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};
    private static final int[][] knightDirections = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};

    public static List<Integer[]> listNextMoves(int[][] board, ChessPiece piece, int row, int col) {
        if (board.length == 0 || board[0].length == 0 || !isValid(board, row, col)) {
            return new ArrayList<>();
        }

        List<Integer[]> nextMoves = new ArrayList<>();
        if (piece == ChessPiece.QUEEN) {
            for (int[] dir : kingDirections) {
                int[] nextSpot = dir;
                while (true) {
                    int r = row + nextSpot[0];
                    int c = col + nextSpot[1];

                    if (isValid(board, r, c)) {
                        nextMoves.add(new Integer[]{r, c});
                        nextSpot = new int[]{nextSpot[0] + dir[0], nextSpot[1] + dir[1]};
                    } else {
                        break;
                    }
                }
            }
        } else {
            int[][] direction = piece == ChessPiece.KING ? kingDirections : knightDirections;
            for (int[] dir : direction) {
                int r = row + dir[0];
                int c = col + dir[1];

                if (isValid(board, r, c)) {
                    nextMoves.add(new Integer[]{r, c});
                }
            }
        }

        return nextMoves;
    }

    private static boolean isValid(int[][] board, int r, int c) {
        int n = board.length;
        if (n == 0) return false;
        int m = board[0].length;
        if (m == 0) return false;

        return r > -1 && r < n && c > -1 && c < m && board[r][c] == 0;
    }
}
