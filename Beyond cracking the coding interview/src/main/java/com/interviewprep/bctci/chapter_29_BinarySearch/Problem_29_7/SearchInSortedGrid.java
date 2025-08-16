package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_7;

public class SearchInSortedGrid {
    private static final int[] ELE_NOT_FOUND_OUTPUT = new int[]{-1, -1};
    
    // Solution which assumes the grid to be flattened
    // Easier implementation
    public static int[] findElementInFlattenedGrid(int[][] grid, int target) {
        int n = grid.length;
        // Edge cases - when the element does not exist FOR SURE
        if (n == 0) {
            return ELE_NOT_FOUND_OUTPUT;
        }
        int m = grid[0].length;
        if (m == 0 || grid[0][0] > target || grid[n - 1][m - 1] < target) {
            return ELE_NOT_FOUND_OUTPUT;
        }

        int s = 0, e = n * m - 1;

        // Base case - preprocessing
        if(grid[0][0] == target) {
            return new int[]{0, 0};
        }
        while (e - s > 1) {
            int mid = s + (e - s) / 2;
            int rowIndex = Math.floorDiv(mid, m);
            int colIndex = mid % m;

            if(grid[rowIndex][colIndex] < target) {
                s = mid;
            } else {
                e = mid;
            }
        }

        int row = Math.floorDiv(e, m);
        int col = e % m;

        return (grid[row][col] == target) ? new int[]{row, col} : ELE_NOT_FOUND_OUTPUT;
    }

    public static int[] findElementInGrid(int[][] grid, int target) {
        int n = grid.length;
        // Edge cases - when the element does not exist FOR SURE
        if (n == 0) {
            return ELE_NOT_FOUND_OUTPUT;
        }
        int m = grid[0].length;
        if (m == 0 || grid[0][0] > target || grid[n - 1][m - 1] < target) {
            return ELE_NOT_FOUND_OUTPUT;
        }

        int targetHousingRow;
        // quick check if the first or last row contains the element
        if (grid[0][m - 1] >= target) {
            targetHousingRow = 0;
        } else if (grid[n - 1][0] <= target) {
            targetHousingRow = n - 1;
        } else {
            // find the row which might house target element (using binary search on the first column)
            // i.e. find the row which has the greatest element in the first column which is less than equal to target
            int s = 0, e = n - 1;
            while (e - s > 1) {
                int mid = s + (e - s) / 2;
                if (grid[mid][0] > target) {
                    e = mid;
                } else {
                    s = mid;
                }
            }
            // when the BS ends, the grid[s][0] <= target and grid[e][0] > target
            targetHousingRow = s;
        }

        // find the element in the targetHousingRow
        int s = 0, e = m - 1;
        if (grid[targetHousingRow][e] == target) {
            return new int[]{targetHousingRow, e};
        }

        while (e - s > 1) {
            int mid = s + (e - s) / 2;
            if (grid[targetHousingRow][mid] > target) {
                e = mid;
            } else {
                s = mid;
            }
        }

        return (grid[targetHousingRow][s] == target) ? new int[]{targetHousingRow, s} : ELE_NOT_FOUND_OUTPUT;
    }
}
