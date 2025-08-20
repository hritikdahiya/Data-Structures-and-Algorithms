package com.interviewprep.bctci.chapter_28_GridsAndMatrices.Problem_28_8;

import lombok.Getter;

import java.util.Arrays;

public class SquareMatrix {
    private final int n;
    @Getter
    private final double[][] grid;

    // grid has to be square matrix
    public SquareMatrix(double[][] grid) {
        n = grid.length;
        this.grid = new double[n][n];
        for (int r = 0; r < n; r++) {
            this.grid[r] = Arrays.copyOf(grid[r], grid[r].length);
        }
    }

    // swap elements across the main diagonal
    public void transpose() {
        for (int r = 0; r < n; r++) {
            for (int c = r + 1; c < n; c++) {
                swapCell(new Cell(r, c), new Cell(c, r));
            }
        }
    }

    public void rotateClockWise() {
        transpose();
        reflectHorizontally();
    }

    public void rotateAntiClockWise() {
        transpose();
        reflectVertically();
    }

    public void reflectHorizontally() {
        // for every row
        for (int r = 0; r < n; r++) {
            // swap the element at rth row with (n-1-r)th cell of that column
            for (int c = 0; c < Math.floorDiv(n, 2); c++) {
                swapCell(new Cell(r, c), new Cell(r, n - 1 - c));
            }
        }
    }

    public void reflectVertically() {
        // for every column
        for (int c = 0; c < n; c++) {
            // swap the element at rth row with (n-1-r)th cell of that column
            for (int r = 0; r < Math.floorDiv(n, 2); r++) {
                swapCell(new Cell(r, c), new Cell(n - 1 - r, c));
            }
        }
    }

    private void swapCell(Cell a, Cell b) {
        double elem = grid[a.r()][a.c()];
        grid[a.r()][a.c()] = grid[b.r()][b.c()];
        grid[b.r()][b.c()] = elem;
    }
}

record Cell(int r, int c) {
}
