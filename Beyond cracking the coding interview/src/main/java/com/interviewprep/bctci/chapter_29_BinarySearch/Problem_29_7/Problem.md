# SEARCH IN SORTED GRID

## Problem statement

You are given a 2D grid of integers, grid, where each row is sorted (without duplicates), and the last value in each row
is smaller than the first value in the following row. You are also given a target value, target. If the target is in the
grid, return an array with its row and column indices. Otherwise, return [-1, -1].

## Example 1

### Input

target = 4
grid = [[1, 2, 4, 5],
        [6, 7, 8, 9]]

### Output

[0, 2]. 
The number 4 is found in row 0 and column 2.

## Example 2

### Input

target = 3
grid = [[1, 2, 4, 5],
        [6, 7, 8, 9]]

### Output

[-1, -1]