# MAX-SUM PATH

## Problem statement

Given a non-empty grid of positive integers, grid, find the path from the top-left corner to the bottom-right corner
with the largest sum. You can only go down or to the right (not diagonal).

## Constraints

- 1 <= R, C <= 1000, where R is the number of rows and C is the number of columns in the grid.
- 1 <= grid[i][j] <= 1000.

## Example 1

### Input

grid = [[1, 4, 3],
[2, 7, 6],
[5, 8, 9]]

### Output

29

The maximum path is 1 -> 4 -> 7 -> 8 -> 9.

## Example 2

### Input

grid = [[5]]

### Output

5

## Example 3

### Input

grid = [[1, 2, 3]]

### Output

6

The maximum path is 1 -> 2 -> 3.