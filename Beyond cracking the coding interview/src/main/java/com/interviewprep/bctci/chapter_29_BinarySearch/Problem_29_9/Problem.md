# MIN-SUBARRAY-SUM SPLIT

## Problem statement

Given a non-empty array with n positive integers, arr, and a number k with 1 ≤ k ≤ n, the goal is to split
arr into k non-empty subarrays so that the largest sum across all subarrays is minimized. Return the largest
sum across all k subarrays after making it as small as possible. Each subarray must contain at least one value


## Example 1

### Input

arr = [10, 5, 8, 9, 11]
k = 3

### Output

17

There are six ways of splitting the array into three subarrays. The optimal split is: `[10, 5], [8, 9], and [11]. The largest sum among the three subarrays is 17.

## Example 2

### Input

arr =  [10, 10, 10, 10, 10]
k = 2

### Output

30
