# COUNT SUBARRAYS WITH BAD DAYS IN RANGE

## Problem statement

We are given an array, sales, where sales[i] is the number of sales on day i. We are also given two numbers, k1 and k2,
with 0 ≤ k1 ≤ k2.

Count the number of subarrays with at least k1 bad days and at most k2 bad days.

A bad day is a day with fewer than 10 sales.

## Constraints

- 0 <= sales.length <= 10^5
- 0 <= sales[i] <= 10^3
- 0 <= k1 <= k2 <= 10^5

## Example 1

### Input

sales = [0, 20, 5], k1 = 2, k2 = 2

### Output

1

The subarray [0, 20, 5] has 2 bad days.

## Example 2

### Input

sales = [0, 20, 5], k1 = 1, k2 = 2

### Output

5

- The subarray [0, 20, 5] has 2 bad days.
- The subarrays [0], [0, 20], [20, 5], and [5] have 1 bad day.

## Example 3

### Input

sales = [10, 20, 30], k1 = 1, k2 = 2

### Output

0

No subarrays have any bad days.