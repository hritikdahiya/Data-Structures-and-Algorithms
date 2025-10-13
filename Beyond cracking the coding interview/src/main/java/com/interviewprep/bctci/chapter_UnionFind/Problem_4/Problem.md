# EDGE IN MST

## Problem statement

Given a weighted, undirected graph, and an index i in the edge list, return whether the i-th edge must be part of any
minimum spanning tree (MST). In other words, return whether any spanning tree that does not contain this edge has a
higher cost than the MST.

- A spanning tree is a subset of edges that connects (i.e., "spans") every node and has no cycles.
- The minimum spanning tree is the spanning tree with minimum edge weight sum. The MST may not be unique.

The graph is given as an edge list. We are given V, the number of nodes, and edges, an edge list where each entry is a
triplet [u, v, w], where u and v are the endpoints of an edge, and w is the weight. Nodes are identified by integers
from 0 to V-1. Weights can be positive, zero, or negative.

## Constraints

- 2 <= V <= 1000 (number of vertices)
- V-1 <= edges.length <= V*(V-1)/2 (connected graph)
- 0 <= u, v < V for each edge [u, v, w]
- -10^6 <= w <= 10^6 (edge weights can be negative, zero, or positive)
- 0 <= i < edges.length (valid edge index)
- The graph is connected (spanning tree exists)

## Example 1

### Input

V = 4,

edges = [[0, 1, 5], [1, 2, 5], [2, 3, 20], [3, 0, 20]], i = 0

### Output

True.

The cost of the MST is 30. There are two MSTs with this cost,
and both contain the edge [0, 1, 5]. Without it, the MST has cost 45.

## Example 2

### Input

V = 4,

edges = [[0, 1, 5], [1, 2, 5], [2, 3, 20], [3, 0, 20]], i = 2

### Output

False.

There is an MST without the edge [2, 3, 20].
