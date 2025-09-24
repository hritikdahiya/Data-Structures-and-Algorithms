# BOOSTING DAYS MULTIPLE TIMES

## Problem statement

Imagine that you have a little bookstore. We have an array, projected_sales, with the projected number of sales per day
in the future.

We are trying to pick k days for an advertising campaign, which we expect to boost the sales on those specific days by 1
sale. You can boost the same day multiple times.

If we pick the days for the advertising campaign correctly, what is the maximum number of consecutive good days in a row
we can get?

A good day is a day with at least 10 sales.

## Constraints

- 0 <= len(projected_sales) <= 10^5
- 0 <= projected_sales[i] <= 10^3
- 0 <= k <= 10^7

## Example 1

### Input

projected_sales = [5, 5, 15, 0, 10],
k = 12

### Output

3

We can reach 3 consecutive good days in two ways:

- boosting days 0 and 1 to reach 10 sales each, or
- boosting day 3 to reach 10 sales.

## Example 2

### Input

projected_sales = [5, 5, 15, 0, 10],
k = 15

### Output

4

We can boost days 1 and 3 to reach 10 sales each.

## Example 3

### Input

projected_sales = [0, 0, 0],
k = 29

### Output

2

We can use all boosts on days 0 and 1 to reach 10 sales each.