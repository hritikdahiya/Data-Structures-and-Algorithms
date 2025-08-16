# IN-PLACE DUPLICATE REMOVAL

## Problem statement

Given a sorted array of integers, arr, remove duplicates in place while preserving the order, and return the number of
unique elements. It doesn't matter what remains in arr beyond the unique elements.

## Constraints

- The array is sorted in non-decreasing order
- The length of arr is at most 10^6

## Example 1

### Input

arr = [1, 2, 2, 3, 3, 3, 5]

### Output

4

After the operation, the first 4 elements should be [1, 2, 3, 5]
The last 3 values could be anything

## Example 2

### Input

arr = []

### Output

0

After the operation, the array remains empty

## Example 3

### Input

arr = [1, 1, 1]

### Output

1

After the operation, the first element should be [1]
The last 2 values could be anything.