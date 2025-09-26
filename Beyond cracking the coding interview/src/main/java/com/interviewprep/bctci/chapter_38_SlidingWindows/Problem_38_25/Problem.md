# COUNT GOOD SUBARRAYS WITH AT LEAST K SALES

## Problem statement

You are given an array, sales, where sales[i] is the number of sales on day i, and a positive number k.

Return the number of subarrays with no bad days and at least k total sales.

A bad day is a day with fewer than 10 sales.

## Constraints

- 0 <= sales.length <= 10^5
- 0 <= sales[i] <= 10^3
- 1 <= k <= 10^7

## Example 1

### Input

sales = [15, 20, 5, 30, 25],
k = 50

### Output

1

The only subarray with no bad days and at least 50 total sales is:

- [30, 25]

## Example 2

### Input

sales = [10, 20, 30],
k = 40

### Output

2

There are no bad days. The subarrays with at least 40 total sales are:

- [10, 20, 30]
- [20, 30]

## Example 3

### Input

sales = [0, 5, 8],
k = 10

### Output

0
All days are bad days.