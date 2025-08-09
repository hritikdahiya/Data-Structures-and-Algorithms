package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInSortedGridTest {
    private static final int[] ELE_NOT_FOUND_OUTPUT = new int[]{-1, -1};

    @Test
    public void targetIsOutsideRange() {
        int[][] grid = new int[2][2];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[1][0] = 3;
        grid[1][1] = 4;

        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInGrid(grid, -1));
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInGrid(grid, 5));

        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInFlattenedGrid(grid, -1));
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInFlattenedGrid(grid, 5));
    }

    @Test
    public void targetWithinRangeExists() {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 3;
        grid[0][2] = 5;
        grid[1][0] = 7;
        grid[1][1] = 9;
        grid[1][2] = 11;
        grid[2][0] = 13;
        grid[2][1] = 15;
        grid[2][2] = 17;

        // assert every item
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assertions.assertArrayEquals(new int[]{i, j}, SearchInSortedGrid.findElementInGrid(grid, grid[i][j]));

                Assertions.assertArrayEquals(new int[]{i, j}, SearchInSortedGrid.findElementInFlattenedGrid(grid, grid[i][j]));
            }
        }
    }

    @Test
    public void targetWithinRangeDoesNotExists() {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 3;
        grid[0][2] = 5;
        grid[1][0] = 7;
        grid[1][1] = 9;
        grid[1][2] = 11;
        grid[2][0] = 13;
        grid[2][1] = 15;
        grid[2][2] = 17;


        // couldn't find in 1st row
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInGrid(grid, 4));
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInFlattenedGrid(grid, 4));
        // couldn't find in 2nd row
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInGrid(grid, 8));
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInFlattenedGrid(grid, 8));
        // couldn't find in 3rd row
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInGrid(grid, 16));
        Assertions.assertArrayEquals(ELE_NOT_FOUND_OUTPUT, SearchInSortedGrid.findElementInFlattenedGrid(grid, 16));
    }
}