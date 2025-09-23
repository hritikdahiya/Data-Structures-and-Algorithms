# MOST SALES IN K DAYS

## Problem statement

Given the array sales and a number k with 1 ≤ k ≤ len(sales), find the most sales in any k-day period.

Return the first day of that period (days start at 0). If there are multiple k-day periods with the most sales, return
the first day of the first one.

## Constraints

- The length of sales is at most 10^6
- Each element in sales is a non-negative integer less than 10^3
- 1 ≤ k ≤ len(sales)

## Example 1

### Input

sales = [8, 1, 3, 7]
k = 2

### Output

2

The subarray of length 2 with maximum sum is [3, 7], which starts at index 2.

## Example 2

### Input

sales = [5, 10, 15, 5]
k = 1

### Output

2

The day with most sales is day 2 with 15 sales.

## Example 3

### Input

sales = [1, 2, 3]
k = 3

### Output

0

The only valid period is the entire array.