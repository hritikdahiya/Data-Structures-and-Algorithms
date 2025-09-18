# RGB DISTANCES

## Problem statement

The taxicab distance between two cells (r1, c1) and (r2, c2) in a grid is defined as abs(r1 - r2) + abs(c1 - c2).

You are given a grid of characters, screen, representing a screen with rows x cols pixels, where each element is one
of 'R', 'G', or 'B'.

Return a grid, output, with the same dimensions, where:

- If screen[i][j] = 'R', output[i][j] is the taxicab distance from screen[i][j] to the closest 'G'
- If screen[i][j] = 'G', output[i][j] is the taxicab distance from screen[i][j] to the closest 'B'
- If screen[i][j] = 'B', output[i][j] is the taxicab distance from screen[i][j] to the closest 'R'

It is guaranteed that the screen contains at least one 'R', one 'G', and one 'B'.

## Constraints

- 1 <= rows, cols <= 1000
- screen[i][j] is one of 'R', 'G', or 'B'
- screen contains at least one of each color
- All the rows have the same length

## Example 1

### Input

screen = [
"RRRGRB",
"BGRGRR",
"RRRGRR",
"RGRRRR",
"GBGRGG"
]

### Output

[
[2, 1, 1, 2, 1, 1],
[1, 1, 1, 3, 1, 2],
[2, 1, 1, 4, 1, 2],
[1, 1, 1, 1, 1, 1],
[1, 2, 1, 1, 3, 4]
]

## Example 2

### Input

screen = [
"RGB"
]

### Output

[
[1, 1, 2]
]