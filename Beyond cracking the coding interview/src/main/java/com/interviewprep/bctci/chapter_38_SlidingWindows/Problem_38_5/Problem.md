# LONGEST GOOD DAY STREAK

## Problem statement

Given an array, sales, where sales[i] is the number of sales on the i-th day, find the most consecutive days with no bad
days.

A bad day is a day with fewer than 10 sales.

## Constraints

- 0 <= len(sales) <= 10^5
- 0 <= sales[i] <= 10^3

## Example 1

### Input

sales = [0, 14, 7, 12, 10, 20]

### Output

3

The subarray [12, 10, 20] has no bad days.

## Example 1

### Input

sales = [10, 10, 10]

### Output

3

All days are good days.

## Example 1

### Input

sales = [5, 5, 5]

### Output

0

There are no good days.