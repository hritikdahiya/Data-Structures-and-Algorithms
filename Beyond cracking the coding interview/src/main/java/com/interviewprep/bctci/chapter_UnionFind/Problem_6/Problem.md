# LARGEST CONNECTED COMPONENTS OVER TIME

## Problem statement

Given a graph as the number V of nodes and a list of edges where each edge is a triplet [u, v, time], where u and v are
nodes between 0 and V - 1 (inclusive) and time is a positive integer representing the time when the edge was added to
the graph. We are also given a sorted list times with positive integers.

Return an array with the same length as times with the size of the largest connected component at each time in times.

## Constraints

- 1 <= V <= 1000 (number of vertices)
- 0 <= edges.length <= V*(V-1)/2 (from no edges to a complete graph)
- 0 <= u, v < V for each edge [u, v, time]
- 1 <= time <= 10^9 for each edge [u, v, time]
- 1 <= times.length <= 10^6
- 1 <= times[i] <= 10^9 for each query time
- times array is sorted in non-decreasing order

## Example 1

### Input

V = 4

edges = [[0, 1, 60], [0, 3, 180], [2, 3, 120]]

times = [30, 120, 210]

### Output

[1,2,4]
