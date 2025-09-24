# SHORTEST PERIOD WITH OVER 20 SALES

## Problem statement

Given an array, sales, where sales[i] is the number of sales on day i, find the shortest period of time with over 20
sales, or -1 if there isn't any.

## Constraints

- 0 <= len(sales) <= 10^5 - 0 <= sales[i] <= 10^3

## Example 1

### Input

sales = [5, 10, 15, 5, 10]

### Output

2

The subarray [10, 15] has over 20 sales.

## Example 2

### Input

sales = [5, 10, 4, 5, 10]

### Output

4

[5, 10, 4, 5] and [10, 4, 5, 10] have over 20 sales.

## Example 3

### Input

sales = [5, 5, 5, 5]

### Output

-1

There is no subarray with more than 20 sales.