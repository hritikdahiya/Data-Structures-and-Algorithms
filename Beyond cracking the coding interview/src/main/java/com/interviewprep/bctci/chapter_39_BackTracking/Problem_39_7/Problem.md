# IKEA SHOPPING

## Problem statement

A magazine has rated every IKEA item from 1 to 10 in terms of style. We have gone to IKEA with a limited budget and the
goal of maximizing the sum of style ratings of the items we buy. We also don't want to pick more than one of each item.
We are given 3 things:

budget, a positive integer,
prices, an array of n positive integers,
ratings, an array of n positive floating-point numbers between 0 and 10 (inclusive).
There are n items. Item i has price prices[i] and style rating ratings[i]. Return an array with the indices of the items
that we should buy.

## Constraints

- n <= 15
- budget <= 10^6
- prices[i] <= 10^4 for all i
- ratings[i] is a floating-point number between 0 and 10 (inclusive)

## Example 1

### Input

budget = 20
prices =  [10, 5, 15, 8, 3]
ratings = [7.0, 3.5, 9.0, 6.0, 2.0]

### Output

[0, 3]

With items 0 and 3, we get a rating sum of 13 without
exceeding the budget.

## Example 2

### Input

budget = 10
prices =  [2, 3, 4, 5]
ratings = [1.0, 2.0, 3.5, 4.0]

### Output

[2, 3]