# NESTED ARRAY SUM

## Problem statement

A nested array is an array where each element is either:

1. An integer, or
2. A nested array (note that this is a recursive definition).

The sum of a nested array is defined recursively as the sum of all its elements. Given a nested array, arr, return its
sum.

## Constraints

- The array can be nested to any depth
- Each integer in the array is between -10^9 and 10^9
- The total number of integers in the array (counting nested ones) is at most 10^5

## Example 1

### Input

arr = [1, [2, 3], [4, [5]], 6]

### Output

21

## Example 2

### Input

arr = [[[[1]], 2]]

### Output

3

## Example 3

### Input

arr = []

### Output

0

## Example 4

### Input

arr = [[], [1, 2], [], [3]]

### Output

6

## Example 5

### Input

arr = [-1, [-2, 3], [4, [-5]], 6]

### Output

5