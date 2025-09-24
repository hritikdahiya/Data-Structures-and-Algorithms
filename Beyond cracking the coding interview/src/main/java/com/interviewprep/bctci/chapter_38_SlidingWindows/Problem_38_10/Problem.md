# AD CAMPAIGN WITH SMALL BOOSTS

## Problem statement

Imagine that you have a little bookstore. We have an array, projected_sales, with the projected number of sales per day
in the future.

We are trying to pick k days for an advertising campaign, which we expect to boost the sales on those specific days by 5
sales. You cannot boost the same day more than once.

If we pick the days for the advertising campaign correctly, what is the maximum number of consecutive good days in a row
we can get?

A good day is a day with at least 10 sales.

## Constraints

- 0 <= len(projected_sales) <= 10^5
- 0 <= projected_sales[i] <= 10^3
- 0 <= k <= len(projected_sales)

## Example 1

### Input

projected_sales = [8, 4, 8],
k = 3

### Output

1

We can boost all 3 days, resulting in [13, 9, 13] projected sales.
The max consecutive good days is 1.

## Example 2

### Input

projected_sales = [10, 5, 8],
k = 1

### Output

2

We should boost day 1, resulting in [10, 10, 8] projected sales.

## Example 3

### Input

projected_sales = [8, 8, 8],
k = 3

### Output

3

We can boost all days to reach 13 sales each.