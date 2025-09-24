# LONGEST ALTERNATING SEQUENCE

## Problem statement

Given the array sales, where sales[i] is the number of sales on the i-th day, find the longest sequence of days
alternating between good days and bad days.

A good day is a day with at least 10 sales. A bad day is a day with fewer than 10 sales.

## Constraints

- 0 <= len(sales) <= 10^5
- 0 <= sales[i] <= 10^3

## Example 1

### Input

sales = [8, 9, 20, 0, 9]

### Output

3

The only good day is day 2, so the subarray [9, 20, 0] alternates
from bad to good to bad.

## Example 1

### Input

sales = [0, 0, 0]

### Output

1

Every day is bad, so we cannot find any pair of consecutive days
that alternate.

## Example 1

### Input

sales = [5, 10, 5, 10]

### Output

4

The entire array alternates between bad and good days.
