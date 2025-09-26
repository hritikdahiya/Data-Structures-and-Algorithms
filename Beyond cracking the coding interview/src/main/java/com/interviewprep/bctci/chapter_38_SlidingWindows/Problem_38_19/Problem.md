# COUNT SUBARRAYS WITH EXACTLY K BAD DAYS

## Problem statement

Given an array, sales, where sales[i] is the number of sales on day i, count the number of subarrays with exactly k bad
days.

A bad day is a day with fewer than 10 sales.

## Constraints

- 0 <= sales.length <= 10^5
- 0 <= sales[i] < 10^3
- 0 <= k <= 10^5

## Example 1

### Input

sales = [0, 20, 5],
k = 1

### Output

4

The subarrays [0], [0, 20], [20, 5], and [5] have 1 bad day each.

## Example 2

### Input

sales = [10, 20, 30],
k = 1

### Output

0

No subarrays have exactly 1 bad day.

## Example 3

### Input

sales = [0, 5, 8],
k = 2

### Output

2

The subarrays [0, 5] and [5, 8] have exactly 2 bad days.