# SORT VALLEY-SHAPED ARRAY

## Problem statement

A valley-shaped array is an array of integers such that:

- It can be split into a non-empty prefix and a non-empty suffix
- The prefix is sorted in decreasing order (duplicates allowed)
- The suffix is sorted in increasing order (duplicates allowed)

Given a valley-shaped array, arr, return a new array with the elements sorted.

## Constraints

- 0 ≤ arr.length ≤ 10^6
- -10^9 ≤ arr[i] ≤ 10^9

## Example 1

### Input

arr = [8, 4, 2, 6]

### Output

[2, 4, 6, 8]

Explanation: Note that the decreasing prefix is not necessarily unique. The
decreasing prefix could be [8, 4] or [8, 4, 2]. The corresponding increasing
suffixes would be [2, 6] or [6].

## Example 2

### Input

arr = [1, 2]

### Output

[1, 2]

The array is already sorted (the decreasing prefix is just
[1]).

## Example 3

### Input

arr = [2, 2, 1, 1]

### Output

[1, 1, 2, 2]