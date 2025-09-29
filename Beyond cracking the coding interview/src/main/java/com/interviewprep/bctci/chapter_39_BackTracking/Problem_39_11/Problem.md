# ESCAPE WITH ALL CLUES

## Problem statement

We are building an escape room puzzle where a player has to collect all the clues in a room to unlock the way out. The
room is represented by a non-empty grid, room, consisting of walkable spaces (0), obstacles (1), and clues (2). The
player starts on the top-left cell of the grid, which is guaranteed to be an open space, and can move to adjacent
cells (diagonals not allowed). If it is possible to collect all the clues without repeating any cell, return an array
with the list of cells in the shortest path to collect them, starting with [0, 0]. Otherwise, return an empty array. If
there are multiple shortest paths, return any of them. It is guaranteed that there is at least one clue.

## Constraints

- room is a 2D grid of 0s, 1s, and 2s.
- room has at least one 2.
- room[0][0] is 0.
- room has at least 1 to 6 rows and 1 to 6 columns.

## Example 1

### Input

room = [
[0, 1, 0],
[0, 2, 0],
[0, 0, 2]
]

### Output

[[0,0], [1,0], [1,1], [1,2], [2,2]].

The other valid output is [[0,0],
[1,0], [1,1], [2,1], [2,2]].

## Example 2

### Input

room = [
[0, 0, 0],
[2, 1, 2]
]

### Output

[].

It is not possible to get both clues without revisiting a cell.

## Example 3

### Input

room = [
[0, 0, 1, 2],
[0, 1, 0, 0]
]

### Output

[].

It is not possible to reach the clue.