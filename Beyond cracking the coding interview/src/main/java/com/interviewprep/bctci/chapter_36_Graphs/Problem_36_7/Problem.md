# HILLIEST CONNECTED COMPONENT

## Problem statement

We're given the adjacency list, graph, of a non-empty, undirected graph with V nodes and an array, heights, of length V,
where heights[i] is a floating-point number representing the height of node i.

A connected component is a maximal set of nodes such that there is a path between any two nodes in the set.

The elevation gain of an edge is the absolute difference of the heights of its endpoints. The hilliness of a connected
component is the average elevation gain of the edges in it, or 0 if it has a single node. The hilliest connected
component is the one with maximum hilliness.

Find the hilliest connected component and return its hilliness.

![hilliest-connected-component-1](hilliest-connected-component-1.png)

## Constraints

- 1 ≤ graph.length ≤ 1000
- graph[i].length < 1000
- 0 ≤ graph[i][j] < graph.length
- The adjacency list is properly formatted, with no parallel edges or self-loops
- heights.length = graph.length
- 0 ≤ heights[i] < 10^9
- heights[i] is a floating-point number

## Example 1

### Input

graph = [
[1, 3], # Node 0
[0, 2], # Node 1
[1, 3], # Node 2
[0, 2]  # Node 3
]

heights = [4.0, 1.0, 3.0, 2.0]

### Output

2.0

The graph has a single connected component. The edge elevation gains are:

- |4 - 1| = 3 for [0, 1]
- |1 - 3| = 2 for [1, 2]
- |3 - 2| = 1 for [2, 3]
- |2 - 4| = 2 for [3, 0]
  The average is 2

## Example 2

### Input

graph = [
[]           # Node 0
]

heights = [5.0]

### Output

0.0

A single-node connected component has hilliness 0

## Example 3

### Input

graph = [
[1], # Node 0
[0], # Node 1
[3], # Node 2
[2]  # Node 3
]

heights = [1.5, 5.5, 0.0, 5.0]

### Output

3.5

The graph has two components:

- {0, 1} with hilliness 3.5
- {2, 3} with hilliness 2.5

## Example 4

### Input

graph = [
[1, 2],     # Node 0
[0, 2],     # Node 1
[0, 1]      # Node 2
]

heights = [3.0, 3.0, 3.0]

### Output

0.0

When all nodes have the same height, the elevation gain is 0 for all edges