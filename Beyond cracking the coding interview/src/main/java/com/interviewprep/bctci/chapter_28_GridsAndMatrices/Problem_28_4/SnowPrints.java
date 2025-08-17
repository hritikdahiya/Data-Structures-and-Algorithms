package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_4;

import static com.interviewprep.bctci.chapter_28_GridsAndMatrices.Utility.isWithinBoundsAndHasValue;

public class SnowPrints {
    private static final int[][] directions = {{-1, 1}, {0, 1}, {1, 1}};

    // T: O(R + C)
    // S: O(1)
    public static int findClosestRow(int[][] prints) {
        if (prints.length == 0 || prints[0].length == 0) {
            throw new IllegalArgumentException();
        }
        int R = prints.length, C = prints[0].length;

        // find the starting row from 1st column
        int startingRow = 0;
        while (startingRow < R && prints[startingRow][0] == 0) {
            startingRow++;
        }

        if (startingRow == R) {
            throw new IllegalArgumentException();
        }

        int closestRow = startingRow;
        int r = startingRow, c = 0;
        while (c < C - 1) {
            boolean foundNextStep = false;
            // one of the new place (calculated using directions) is guaranteed to be within bounds
            // hence, value of c will increment till it reaches C and while loop breaks;
            for (int[] direction : directions) {
                int newR = r + direction[0];
                int newC = c + direction[1];

                if (isWithinBoundsAndHasValue(prints, newR, newC, 1)) {
                    // calculate row closest to the top
                    closestRow = Math.min(closestRow, newR);
                    // since ony one of the neighbor has the snowprint, move the current cell to that and break this loop
                    r = newR;
                    c = newC;
                    foundNextStep = true;
                    break;
                }
            }

            if (!foundNextStep) {
                throw new IllegalArgumentException("Invalid input grid. There should be a path from cell [" + r + ", " + c + "] to the next column");
            }
        }

        return closestRow;
    }
}
