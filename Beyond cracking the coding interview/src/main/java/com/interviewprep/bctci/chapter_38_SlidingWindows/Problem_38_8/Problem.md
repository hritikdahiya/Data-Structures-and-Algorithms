# MAXIMUM WITH AT MOST 3 BAD DAYS

## Problem statement

Given an array sales, where sales[i] is the number of sales on the i-th day, find the most consecutive days with at most
3 bad days.

A bad day is a day with fewer than 10 sales.

## Constraints

- 0 <= len(sales) <= 10^5
- 0 <= sales[i] <= 10^3

## Example 1

### Input

sales = [0, 14, 7, 9, 0, 20, 10, 0, 10]

### Output

6

There are two 6-day periods with at most 3 bad days:

- [14, 7, 9, 0, 20, 10]
- [9, 0, 20, 10, 0, 10]

## Example 2

### Input

sales = [10, 10, 10]

### Output

3

All days are good days.

## Example 3

### Input

sales = [5, 5, 5, 5]

### Output

3

We can include at most 3 bad days.
