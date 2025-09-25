# SMALLEST RANGE WITH K ELEMENTS

## Problem statement

Given an array of integers, arr, and a number k with 1 ≤ k ≤ len(arr), return a pair of numbers [low, high], with low ≤
high, representing the smallest range such that there are at least k elements in arr with values at least low and at
most high.

If there are multiple valid answers, return any of them.

## Constraints

- 1 <= k <= len(arr) <= 10^5
- -10^9 <= arr[i] <= 10^9

## Example 1

### Input

arr = [1, 2, 5, 7, 8],
k = 3

### Output

[5, 8]

The range has 3 elements in arr (5, 7, and 8).
It is smaller than other ranges with 3 elements, such as [1, 5], because 8-5 <
5-1.

## Example 2

### Input

arr = [5, 5, 2, 2, 8, 8],
k = 3

### Output

[2, 5]

The range has 4 elements in arr (5, 5, 2, and 2).
There is no smaller range with at least 3 elements.
[5, 8] is also a valid answer.

## Example 3

### Input

arr = [0],
k = 1

### Output

[0, 0]