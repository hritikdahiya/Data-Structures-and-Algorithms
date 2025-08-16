# MERGE TWO SORTED ARRAYS

## Problem statement

Given two sorted arrays of integers, arr1 and arr2, return a new array that contains all the elements in arr1 and arr2
in sorted order, including duplicates.

## Constraints

- arr1 and arr2 are sorted in ascending order
- 0 ≤ arr1.length, arr2.length ≤ 10^6
- -10^9 ≤ arr1[i], arr2[i] ≤ 10^9

## Example 1

### Input

arr1 = [1, 3, 4, 5]
arr2 = [2, 4, 4]

### Output

[1, 2, 3, 4, 4, 4, 5]

## Example 2

### Input

arr1 = [-1]
arr2 = []

### Output

[-1]

## Example 3

### Input

arr1 = [1, 3, 5]
arr2 = [2, 4, 6]

### Output

[1, 2, 3, 4, 5, 6]