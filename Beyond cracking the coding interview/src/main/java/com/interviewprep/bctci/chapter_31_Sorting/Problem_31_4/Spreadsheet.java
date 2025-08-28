package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_4;

import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;

public class Spreadsheet {
    @Getter
    private final Integer[][] grid;
    private final int rows;
    private final int cols;

    Spreadsheet(int r, int c) {
        rows = r;
        cols = c;
        grid = new Integer[r][c];
        for (Integer[] row : grid) {
            Arrays.fill(row, 0);
        }
    }

    public void set(int r, int c, int val) {
        checkIndexOutOfBound(r, c);
        grid[r][c] = val;
    }

    public Integer get(int r, int c) {
        checkIndexOutOfBound(r, c);
        return grid[r][c];
    }

    public void sortColumnsByRow(int r) {
        checkIndexOutOfBound(r, 0);

        Integer[] colIndices = new Integer[cols];
        for (int i = 0; i < cols; i++) {
            colIndices[i] = i;
        }

        // sort col indices based on the row to sort by
        Arrays.sort(colIndices, (col1, col2) -> Integer.compare(grid[r][col1], grid[r][col2]));

        // modify every row based on the colIndices ordering
        for (int i = 0; i < rows; i++) {
            Integer[] modifiedRow = new Integer[cols];
            for (int j = 0; j < cols; j++) {
                modifiedRow[j] = grid[i][colIndices[j]];
            }
            grid[i] = modifiedRow;
        }
    }

    public void sortRowsByColumn(int c) {
        checkIndexOutOfBound(0, c);

        // use built-in sort method with a simple comparator
        Arrays.sort(grid, Comparator.comparingInt(row -> row[c]));
    }

    private void checkIndexOutOfBound(int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            throw new IndexOutOfBoundsException();
        }
    }
}
