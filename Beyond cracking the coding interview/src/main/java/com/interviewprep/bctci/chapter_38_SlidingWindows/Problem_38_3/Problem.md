# UNIQUE BEST SELLER STREAK

## Problem statement

We are given an array, best_seller, with the title of the most sold book for each day over a given period. We are also
given a number k with 1 ≤ k ≤ len(sales).

We need to return whether there is any k-day period where each day has a different best-selling title.

## Constraints

- The length of best_seller is at most 10^6
- Each book title has length at most 100
- 1 <= k <= len(best_seller)

## Example 1

### Input

best_seller = ["book3", "book1", "book3", "book3", "book2", "book3", "book4",
"book3"]
k = 3

### Output

True

There is a 3-day period without a repeated value: ["book2", "book3", "book4"]

## Example 2

### Input

best_seller = ["book3", "book1", "book3", "book3", "book2", "book3", "book4",
"book3"]
k = 4

### Output

False

There are no 4-day periods without a repeated value

## Example 3

### Input

best_seller = ["book1", "book2", "book3"]
k = 3

### Output

True

The entire array has no repeated values