# COUNT SUBARRAYS WITH ALL REMAINDERS

## Problem statement

Given an array of positive integers, arr, return the number of subarrays that have at least one of each of the
following:

1. a multiple of 3
2. a number with remainder 1 when divided by 3
3. a number with remainder 2 when divided by 3

## Constraints

- 0 <= arr.length <= 10^5
- 1 <= arr[i] <= 10^9

## Example 1

### Input

arr = [9, 8, 7]

### Output

1

The subarray [9, 8, 7] counts because:

- 9 % 3 is 0
- 7 % 3 is 1
- 8 % 3 is 2

## Example 2

### Input

arr = [1, 2, 3, 4, 5]

### Output

6

The subarrays are:

- [1, 2, 3]
- [2, 3, 4]
- [3, 4, 5]
- [1, 2, 3, 4]
- [2, 3, 4, 5]
- [1, 2, 3, 4, 5]

## Example 3

### Input

arr = [1, 3, 4, 6, 7, 9]

### Output

0

There are no numbers with remainder 2 when divided by 3.