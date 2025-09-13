# HIGHEST AVERAGE ELEVATION GAIN

## Problem statement

You are given V > 0, the number of nodes in a graph, and an array, edges, where edges[i] is a
triplet [node1, node2, elevation_gain] representing an edge and an associated elevation gain.

Find the connected component with the highest average edge elevation gain and return that average as a floating-point
number.

## Constraints

- 1 ≤ V ≤ 1000
- edges.length ≤ 10^6
- 0 ≤ edges[i][0], edges[i][1] < V
- edges[i][0] != edges[i][1]
- 0 ≤ edges[i][2] ≤ 10^9
- edges[i][2] is an integer
- The graph is well-formed, with no parallel edges or self-loops
- The output should be within 6 decimal places of precision

## Example 1

### Input

V = 4

edges = [[0, 1, 3], [1, 2, 2], [2, 3, 1], [3, 0, 2]]

### Output

2.0

The graph is a single connected component. Its average elevation gain is (3 + 2 + 1 + 2) / 4 = 2.0

## Example 2

### Input

V = 2

edges = [[0, 1, 5]]

### Output

5.0

There is a single edge

## Example 3

### Input

V = 6

edges = [[0, 1, 1], [1, 2, 2], [3, 4, 3], [4, 5, 5]]

### Output

4.0

The graph has 2 connected components:

- {0, 1, 2} with average gain (1 + 2)/2 = 1.5
- {3, 4, 5} with average gain (3 + 5)/2 = 4.0