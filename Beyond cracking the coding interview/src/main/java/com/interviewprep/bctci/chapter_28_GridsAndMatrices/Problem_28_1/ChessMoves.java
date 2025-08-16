package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_1;

import java.util.ArrayList;
import java.util.List;

import static com.interviewprep.bctci.chapter_28_GridsAndMatrices.Utility.isWithinBoundsAndHasValue;

public class ChessMoves {
    private static final int[][] kingDirections = {{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};
    private static final int[][] knightDirections = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};

    public static List<Integer[]> listNextMoves(int[][] board, ChessPiece piece, int row, int col) {
        if (board.length == 0 || board[0].length == 0 || !isWithinBoundsAndHasValue(board, row, col, 0)) {
            return new ArrayList<>();
        }

        List<Integer[]> nextMoves = new ArrayList<>();
        if (piece == ChessPiece.QUEEN) {
            for (int[] dir : kingDirections) {
                int r = row + dir[0];
                int c = col + dir[1];
                // go all the way in any direction (since queen can jump more than 1 spot in any direction
                while (isWithinBoundsAndHasValue(board, r, c, 0)) {
                    // mark the result array with 1 if queen can reach it
                    nextMoves.add(new Integer[]{r, c});
                    r += dir[0];
                    c += dir[1];
                }
            }
        } else {
            int[][] direction = piece == ChessPiece.KING ? kingDirections : knightDirections;
            for (int[] dir : direction) {
                int r = row + dir[0];
                int c = col + dir[1];

                if (isWithinBoundsAndHasValue(board, r, c, 0)) {
                    nextMoves.add(new Integer[]{r, c});
                }
            }
        }

        return nextMoves;
    }
}
