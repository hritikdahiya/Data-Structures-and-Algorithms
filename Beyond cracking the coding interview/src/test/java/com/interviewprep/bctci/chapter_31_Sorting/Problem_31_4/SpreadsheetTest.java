package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpreadsheetTest {

    @Test
    public void testSpreadsheet() {
        // single row
        Spreadsheet spreadsheet = new Spreadsheet(1, 3);
        spreadsheet.set(0, 0, 5);
        spreadsheet.set(0, 1, 3);
        spreadsheet.set(0, 2, 8);

        spreadsheet.sortRowsByColumn(1);
        Integer[][] expectedGrid = new Integer[][]{
                {5, 3, 8}
        };
        verifyResult(expectedGrid, spreadsheet.getGrid());


        spreadsheet.sortColumnsByRow(0);
        expectedGrid = new Integer[][]{
                {3, 5, 8}
        };
        verifyResult(expectedGrid, spreadsheet.getGrid());

        // single column
        spreadsheet = new Spreadsheet(3, 1);
        spreadsheet.set(0, 0, 5);
        spreadsheet.set(1, 0, 3);
        spreadsheet.set(2, 0, 8);

        spreadsheet.sortColumnsByRow(2);
        expectedGrid = new Integer[][]{
                {5},
                {3},
                {8}
        };
        verifyResult(expectedGrid, spreadsheet.getGrid());


        spreadsheet.sortRowsByColumn(0);
        expectedGrid = new Integer[][]{
                {3},
                {5},
                {8}
        };
        verifyResult(expectedGrid, spreadsheet.getGrid());


        // normal grid
        spreadsheet = new Spreadsheet(3, 3);
        spreadsheet.set(0, 0, 5);
        spreadsheet.set(0, 1, 3);
        spreadsheet.set(0, 2, 8);
        spreadsheet.set(1, 0, 6);
        spreadsheet.set(2, 1, 1);

        spreadsheet.sortColumnsByRow(0);
        expectedGrid = new Integer[][]{
                {3, 5, 8},
                {0, 6, 0},
                {1, 0, 0}
        };
        verifyResult(expectedGrid, spreadsheet.getGrid());


        spreadsheet.sortRowsByColumn(1);
        expectedGrid = new Integer[][]{
                {1, 0, 0},
                {3, 5, 8},
                {0, 6, 0}
        };
        verifyResult(expectedGrid, spreadsheet.getGrid());

    }

    private void verifyResult(Integer[][] expectedGrid, Integer[][] actualGrid) {
        Assertions.assertEquals(expectedGrid.length, actualGrid.length);
        for (int i = 0; i < expectedGrid.length; i++) {
            Assertions.assertArrayEquals(expectedGrid[i], actualGrid[i]);
        }
    }
}