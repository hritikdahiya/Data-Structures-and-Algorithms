# SPANNING TREE

## Problem statement

Given the adjacency list of an undirected, connected graph, graph, return a set of edges forming a spanning tree.

A spanning tree is a subset of edges that connects (i.e., "spans") every node and has no cycles.

## Constraints

- 1 ≤ graph.length ≤ 1000
- graph[i].length < 1000
- 0 ≤ graph[i][j] < graph.length
- The adjacency list is properly formatted, with no parallel edges or self-loops
- The graph is connected

## Example 1

### Input

graph = [
[1],
[0, 2, 5],
[1, 3, 4],
[2],
[2, 5],
[1, 4]
]

### Output

[[0, 1], [1, 2], [2, 3], [2, 4], [4, 5]]
There are other valid answers

## Example 2

### Input

[[0, 1], [1, 2], [2, 3], [2, 4], [4, 5]]
There are other valid answers

### Output

[[0, 1], [1, 2], [2, 3], [2, 4], [4, 5]]
There are other valid answers

## Example 3

### Input

graph = [
[1, 2],
[0, 2],
[0, 1]
]

### Output

[[0, 1], [0, 2]]
There are other valid answers, like [[0, 1], [1, 2]].

## Example 3

### Input

[[]]

### Output

[]
This graph has a single node and no edges.