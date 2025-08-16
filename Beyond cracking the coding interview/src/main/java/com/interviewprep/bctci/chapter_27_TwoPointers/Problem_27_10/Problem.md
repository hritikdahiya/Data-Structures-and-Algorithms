# MISSING NUMBERS IN RANGE

## Problem statement

Given a sorted array of integers, arr, and two values indicating a range, low and high, with low <= high, return a new
array with all the numbers in the range that do not appear in arr.

## Constraints

- arr is sorted in ascending order
- 0 ≤ arr.length ≤ 10^6
- -10^9 ≤ low ≤ high ≤ 10^9
- All elements in arr are in the range [-10^9, 10^9]
- high - low ≤ 10^6

## Example 1

### Input

arr = [6, 9, 12, 15, 18]
low = 9
high = 13

### Output

[10, 11, 13]

Explanation: The numbers 10, 11, and 13 are in the range [9, 13] but not in
arr.

## Example 2

### Input

arr = []
low = 9
high = 9

### Output

[9]

Explanation: 9 is in the range [9, 9] but arr is empty.

## Example 3

### Input

arr = [6, 7, 8, 9]
low = 7
high = 8

### Output

[]

Explanation: Every number in the range [7, 8] appears in arr.