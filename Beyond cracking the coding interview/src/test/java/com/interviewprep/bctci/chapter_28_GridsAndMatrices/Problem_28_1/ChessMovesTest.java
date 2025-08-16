package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class ChessMovesTest {

    @Test
    void listNextMoves() {
        int[][] board = {};
        Integer[][] expectedNextMoves = {};
        Integer[][] nextMoves = ChessMoves.listNextMoves(board, ChessPiece.KING, 1, 5).toArray(new Integer[0][0]);
        Assertions.assertArrayEquals(expectedNextMoves, nextMoves);

        board = new int[][]{
                {0, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 1, 0},
                {1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0}
        };
        expectedNextMoves = new Integer[][]{
                {2, 5}, {3, 4}, {4, 4}, {4, 5}
        };
        nextMoves = ChessMoves.listNextMoves(board, ChessPiece.KING, 3, 5).toArray(new Integer[0][0]);
        verifyResult(expectedNextMoves, nextMoves);

        board = new int[][]{
                {0, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 1, 0},
                {1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0}
        };
        expectedNextMoves = new Integer[][]{
                {2, 2}, {3, 5}, {5, 5}
        };
        nextMoves = ChessMoves.listNextMoves(board, ChessPiece.KNIGHT, 4, 3).toArray(new Integer[0][0]);
        verifyResult(expectedNextMoves, nextMoves);


        board = new int[][]{
                {0, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 1, 0},
                {1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0}
        };
        expectedNextMoves = new Integer[][]{
                {3, 4}, {3, 5}, {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 5}, {5, 3}, {5, 4}, {5, 5}
        };
        nextMoves = ChessMoves.listNextMoves(board, ChessPiece.QUEEN, 4, 4).toArray(new Integer[0][0]);
        verifyResult(expectedNextMoves, nextMoves);
    }

    private static void verifyResult(Integer[][] expectedNextMoves, Integer[][] nextMoves) {
        // sort for equal comparison
        Arrays.sort(expectedNextMoves, Comparator.comparingInt((Integer[] a) -> a[0])
                                                 .thenComparingInt(a -> a[1]));
        Arrays.sort(nextMoves, Comparator.comparingInt((Integer[] a) -> a[0])
                                         .thenComparingInt(a -> a[1]));

        for (int i = 0; i < expectedNextMoves.length; i++) {
            Integer[] move = nextMoves[i];
            Assertions.assertArrayEquals(expectedNextMoves[i], move);
        }
    }
}