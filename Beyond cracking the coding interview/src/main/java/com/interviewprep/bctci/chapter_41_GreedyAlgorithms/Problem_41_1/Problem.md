# MOST NON-OVERLAPPING INTERVALS

## Problem statement

Given a list, intervals, where each element is a pair of integers [l, r], with l ≤ r, representing an interval (with
both endpoints included). Return the largest number of non-overlapping intervals.

## Constraints

- 0 ≤ intervals.length ≤ 10^5
- intervals[i].length = 2
- 0 ≤ intervals[i][j] ≤ 10^9

## Example 1

### Input

intervals = [[2, 3], [1, 4], [2, 3], [3, 6], [8, 9]]

### Output

2

For instance, [2, 3] and [8, 9] don't overlap. We can't add [3, 6] because it
overlaps with [2, 3] at value 3.

## Example 2

### Input

intervals = [[1, 2], [2, 3], [3, 4]]

### Output

2

## Example 3

### Input

intervals = [[1, 10], [8, 9], [2, 3]]

### Output

2