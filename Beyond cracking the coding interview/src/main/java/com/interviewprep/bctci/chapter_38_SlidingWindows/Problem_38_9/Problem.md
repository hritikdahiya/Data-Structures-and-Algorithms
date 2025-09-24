# AD CAMPAIGN BOOST

## Problem statement

Imagine that you have a little bookstore. We have an array, projected_sales, with the projected number of sales per day
in the future.

We are trying to pick k days for an advertising campaign, which we expect to boost the sales on those specific days by
at least 20.

If we pick the days for the advertising campaign correctly, what is the maximum number of consecutive good days in a row
we can get?

A good day is a day with at least 10 sales.

## Constraints

- 1 <= k <= len(projected_sales) <= 10^5
- 0 <= projected_sales[i] <= 10^3

## Example 1

### Input

projected_sales = [5, 0, 20, 0, 5],
k = 2

### Output

3

The only good day is day 2. We can boost:

- days 0 and 1,
- days 1 and 3, or
- days 3 and 4.

For instance, if we boost days 0 and 1, the projected sales become:
[25, 20, 20, 0, 5], with 3 consecutive good days.

## Example 1

### Input

projected_sales = [0, 10, 0, 10],
k = 1

### Output

3

We can boost day 2; boosting day 0 is suboptimal.

## Example 1

### Input

projected_sales = [5, 5, 5],
k = 3

### Output

3

We can boost all days to make them good days.