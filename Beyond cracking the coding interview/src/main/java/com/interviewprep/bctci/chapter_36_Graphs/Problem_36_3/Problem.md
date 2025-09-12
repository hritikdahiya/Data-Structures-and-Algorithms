# TREE CHECK

## Problem statement

Given a non-empty adjacency list of an undirected graph, graph, return whether it is a tree. A graph is a tree if it is
acyclic and connected.

## Constraints

- 1 ≤ graph.length ≤ 1000
- graph[i].length < 1000
- 0 ≤ graph[i][j] < graph.length
- The adjacency list is properly formatted, with no parallel edges or self-loops

## Example 1

### Input

graph = [
[2],            # Node 0
[2, 5],         # Node 1
[0, 1, 3, 4],   # Node 2
[2],            # Node 3
[2],            # Node 4
[1]             # Node 5
]

### Output

True.
See left graph in the picture above

## Example 2

### Input

graph = [
[2],        # Node 0
[5],        # Node 1
[0, 3],     # Node 2
[2],        # Node 3
[],         # Node 4
[1]         # Node 5
]

### Output

False.
This graph is not connected. See center graph in the picture above

## Example 3

### Input

graph = [
[1],        # Node 0
[0, 2, 5],  # Node 1
[1, 3, 4],  # Node 2
[2],        # Node 3
[2, 5],     # Node 4
[1, 4]      # Node 5
]

### Output

True.
This graph is not acyclic. See right graph in the picture above