# 4 DIRECTIONAL MAX SUM PATH

## Problem statement

Given an RxC grid of integers (which can be negative), grid, return the path from the top-left corner to the
bottom-right corner with the largest sum. You can go in all four directions (diagonals not allowed), but you can't visit
a cell more than once.

## Constraints

- grid has at least 1 to 5 rows and 1 to 5 columns.
- grid[i][j] is an integer between -100 and 100.

## Example 1

### Input

grid = [
[ 1, -4, 3],
[-2, 7, -6],
[ 5, -4, 9]
]

### Output

[[0, 0], [0, 1], [1, 1], [1, 0], [2, 0], [2, 1], [2, 2]]

The maximum path is 1 -> -4 -> 7 -> -2 -> 5 -> -4 -> 9, which has sum 12.