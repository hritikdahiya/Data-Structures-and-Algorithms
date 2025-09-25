# STRONGEST START AND ENDING

## Problem statement

Imagine that you have a little bookstore. We have an array, projected_sales, with the projected number of sales per day
of fall.

We would like to start and close the season strong. We want to have as many consecutive good days as possible starting
from day 0 and as many consecutive good days as possible ending on the last day.

A good day is a day with at least 10 sales.

We can pick k days to boost with advertising, which we expect to boost the sales on those specific days by at least 20.
What's the maximum number of combined initial good days and final good days we can have?

## Constraints

- 0 <= len(projected_sales) <= 10^5 (the bookstore is in a fictional world with very long fall seasons)
- 0 <= projected_sales[i] <= 10^3
- 0 <= k <= 10^5

## Example 1

### Input

projected_sales = [10, 0, 0, 0, 10, 0, 0, 10],
k = 2

### Output

5

We should boost days 5 and 6 so that the projected sales after boosting are:
[10, 0, 0, 0, 10, 20, 20, 10]
This way, we have 1 initial and 4 final good days.

## Example 2

### Input

projected_sales = [0, 10, 0, 10],
k = 1

### Output

3

It does not matter which day you boost.

## Example 3

### Input

projected_sales = [5, 5, 5],
k = 2

### Output

2

We can boost any two days.