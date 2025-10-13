# NUM GROUP OPERATIONS

## Problem statement

Implement a data structure that maintains disjoint sets and supports the following operations:

- add(x): Add a new element x in its own set
- find(x): Return the representative of x's set
- union(x, y): Merge the sets containing x and y
- size(): Return the number of elements
- num_groups(): Return the total number of disjoint sets

The data structure should support all operations in, at worst, O(log n) amortized time, where n is the number of
elements in the data structure.

## Constraints

- If your language is typed, you can either implement a union-find for integers, or make it generic.
- The data structure will contain at most 10^6 elements.
- Each element is added at most once (no duplicate adds).
- find and union operations are only called on elements that have been added.

## Example 1

### Input

### Output
