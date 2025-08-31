# COMPRESS ARRAY

## Problem statement

Given an array of integers, arr, a compress operation finds the first pair of consecutive equal numbers and combines
them into their sum. If there are no consecutive equal numbers, the array is considered fully compressed. Your goal is
to repeatedly compress the array until it is fully compressed.

## Constraints

- The length of arr is at most 10^5
- Each element in arr is a non-negative integer less than 10^3

## Example 1

### Input

arr = [8, 4, 2, 2, 2, 4]

### Output

[16, 2, 4]

The steps are [8, 4, 2, 2, 2, 4] -> [8, 4, 4, 2, 4] -> [8, 8, 2, 4] -> [16, 2,
4]

## Example 2

### Input

arr = [4, 4, 4, 4]

### Output

[16]

The steps are [4, 4, 4, 4] -> [8, 4, 4] -> [8, 8] -> [16]

## Example 3

### Input

arr = [1, 2, 3, 4]

### Output

[1, 2, 3, 4]