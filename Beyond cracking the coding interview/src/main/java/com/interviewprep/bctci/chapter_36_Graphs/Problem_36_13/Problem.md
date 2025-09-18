# COUNT GRID ISLANDS

## Problem statement

In this classic problem, you are given a binary grid, grid, where 0 represents water and 1 represents solid ground. The
goal is to count the number of islands in the grid, where an island is a four-directionally contiguous land region.

Return the number of islands in the grid.

## Constraints

- 0 <= grid.length <= 1000
- 0 <= grid[i].length <= 1000
- grid[i][j] is either 0 or 1
- All the rows have the same length
- Each island contains at most 500 cells
xx2
## Example 1

### Input

grid = [
[0, 0, 1, 0],
[1, 1, 0, 1],
[0, 0, 1, 1]
]

### Output

3

## Example 2

### Input

grid = [
[]
]

### Output

0

## Example 3

### Input

grid = [
[1]
]

### Output

1

## Example 4

### Input

grid = [
[1, 0, 1],
[0, 0, 0],
[1, 0, 1]
]

### Output

4