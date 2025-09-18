# MULTI-EXIT MAZE

## Problem statement

A few friends are trapped on a maze represented by a grid of letters:

- 'X' represents a wall.
- 'O' represents an exit. There may be multiple exits.
- '.' represents a walkable space.

Given the grid, maze, return a grid with the same dimensions. Each cell (r, c) should contain the minimum number of
steps needed to go from position (r, c) in the maze to the closest exit. If (r, c) is a wall in the maze, return -1 at
that position. It is guaranteed that every walkable cell can reach an exit.

## Constraints

- 1 <= maze.length <= 1000
- 1 <= maze[i].length <= 1000
- maze[i][j] is either '.', 'X', or 'O'
- All the rows have the same length

## Example 1

### Input

maze = [
"...X.O",
"OX.X..",
"...X..",
".X....",
"XOX.XX"
]

### Output

[
[ 1, 2, 3, -1, 1, 0],
[ 0, -1, 4, -1, 2, 1],
[ 1, 2, 3, -1, 3, 2],
[ 2, -1, 4, 5, 4, 3],
[-1, 0, -1, 6, -1, -1]
]

## Example 2

### Input

maze = [
"...",
".O.",
"..."
]

### Output

[
[2, 1, 2],
[1, 0, 1],
[2, 1, 2]
]