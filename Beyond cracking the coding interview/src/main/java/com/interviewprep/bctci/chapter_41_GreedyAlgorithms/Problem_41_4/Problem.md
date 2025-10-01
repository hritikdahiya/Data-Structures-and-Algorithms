# MINIMUM TRIPLET MEDIANS

## Problem statement

You are given a non-empty list of distinct integers, arr, where the length of arr is guaranteed to be a multiple of
three. Your task is to group the numbers into triplets such that the sum of the medians of each triplet (the middle
value in sorted order) is minimized. Return the sum of the medians.

## Constraints

- The length of arr is a multiple of three.
- 3 <= arr.length < 10^5
- 1 <= arr[i] <= 10^9
- All elements in arr are distinct.

## Example 1

### Input

arr = [6, 5, 8, 2, 1, 9]

### Output

8

One optimal grouping is [1, 2, 8], [5, 6, 9]
The sum of the medians is 2 + 6 = 8
Another optimal grouping is [1, 2, 9], [5, 6, 8]

## Example 2

### Input

arr = [6, 5, 8, 2, 1, 9, 12, 15, 14]

### Output

17

One optimal grouping is [5, 6, 14], [1, 2, 12], [8, 9, 15]
The sum of the medians is 6 + 2 + 9 = 17