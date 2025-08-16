package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_3;

import java.util.Arrays;

import static com.interviewprep.bctci.chapter_28_GridsAndMatrices.Utility.isWithinBoundsAndHasValue;

public class SpiralOrder {
    // D, L, U, R
    private static final int[][] clockwise_directions = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    // U, L, D, R
    private static final int[][] anti_clockwise_directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    /**
     * Algorithm -
     * <ul>
     * <li>- Initialize current index at [n/2, n/2] and set it to 0</li>
     * <li>- write 1 element DOWN, 1 element LEFT</li>
     * <li>- Write 2 element UP, 2 elements RIGHT</li>
     * <li>- Write 3 elements DOWN, 3 elements LEFT</li>
     * <li>- Write 4 elements UP, 4 elements RIGHT</li>
     * <li>- ... and repeat till the value to write is n^2 (i.e. entire array is filled)</li>
     * </ul>
     */
    public static int[][] draw(int n) {
        if (n % 2 == 0) {
            throw new IllegalArgumentException();
        }

        // initialize spiral array with middle element as 0
        int[][] spiral = new int[n][n];
        int r = (n - 1) / 2, c = (n - 1) / 2;
        spiral[r][c] = 0;

        int val = 1;
        int numOfWriterPerDirection = 1;
        int directionIndex = 0;
        while (true) {
            // Write in 2 clockwise_directions before the number of writes per direction is incremented
            for (int _i = 0; _i < 2; _i++) {
                // Write "numOfWriterPerDirection" elements in a single direction
                for (int _j = 0; _j < numOfWriterPerDirection; _j++) {
                    // breaking condition - array is filled
                    if (val == n * n) {
                        return spiral;
                    }

                    r += clockwise_directions[directionIndex][0];
                    c += clockwise_directions[directionIndex][1];

                    spiral[r][c] = val++;
                }
                // once a direction has been written to "numOfWriterPerDirection" number of times,
                // Change direction clock-wise
                directionIndex = (directionIndex + 1) % 4;
            }
            // after 2 direction changes, increment the number of items to be written in any direction from the current index
            numOfWriterPerDirection++;
        }
    }

    public static int[][] drawReverse(int n) {
        if (n % 2 == 0) {
            throw new IllegalArgumentException();
        }

        // initialize spiral array with middle element as 0
        int[][] spiral = new int[n][n];
        for (int[] spiralRows : spiral) {
            Arrays.fill(spiralRows, 0);
        }

        int val = n * n - 1;
        int r = n, c = n - 1, directionIndex = 0;
        while (val > 0) {
            int newR = r + anti_clockwise_directions[directionIndex][0];
            int newC = c + anti_clockwise_directions[directionIndex][1];

            if (isWithinBoundsAndHasValue(spiral, newR, newC, 0)) {
                r = newR;
                c = newC;
                spiral[r][c] = val--;
            } else {
                directionIndex = (directionIndex + 1) % 4;
            }
        }

        return spiral;
    }
}
