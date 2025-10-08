# COUNTING PATHS

## Problem statement

Given the adjacency list of an unweighted DAG, graph, and a node, start, return an array of length V (the number of
nodes) with the number of different paths from start to every node.

## Constraints

- The number of nodes is at most 10^5
- The number of edges is at most 10^6
- Each node is labeled from 0 to V-1

## Example 1

### Input

```
graph = [
  [1],        # Neighbors of node 0
  [],         # Neighbors of node 1
  [1],        # Neighbors of node 2
  [4],        # Neighbors of node 3
  [1, 2, 5],  # Neighbors of node 4
  [2]         # Neighbors of node 5
]
```

start = 4

### Output

[0, 3, 2, 0, 1, 1]

Nodes 0 and 3 are unreachable from node 4.
There is a single path from 4 to itself, the empty path.
There are 3 paths from node 4 to node 1:
4 -> 1,
4 -> 2 -> 1,
4 -> 5 -> 2 -> 1
