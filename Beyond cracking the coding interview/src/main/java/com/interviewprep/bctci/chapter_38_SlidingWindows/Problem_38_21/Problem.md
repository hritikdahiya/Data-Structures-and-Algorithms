# COUNT SUBARRAYS WITH GOOD START AND ENDING

## Problem statement

Given an array, sales, where sales[i] is the number of sales on day i, return the number of subarrays that start and end
on a good day.

A good day is a day with at least 10 sales.

## Constraints

- 0 <= sales.length <= 10^5
- 0 <= sales[i] < 10^3

## Example 1

### Input

sales = [0, 20, 5, 15, 10]

### Output

6

The good days are at indices 1, 3, and 4
The valid subarrays are:

- [20]
- [15]
- [10]
- [20, 5, 15]
- [15, 10]
- [20, 5, 15, 10]

## Example 2

### Input

sales = [0, 5, 8]

### Output

0

There are no good days.

## Example 3

### Input

sales = [10, 20, 30]

### Output

6

All days are good, so all subarrays count.