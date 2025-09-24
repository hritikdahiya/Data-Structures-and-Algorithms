# LONGEST PERIOD AT MOST K DISTINCT

## Problem statement

We are given an array of strings, best_seller, where best_seller[i] is the title of the most sold book for day i, and a
number k ≥ 1.

Find the maximum consecutive days with at most k distinct best-selling books.

## Constraints

- 0 <= len(best_seller) <= 10^6
- 0 <= k <= len(best_seller)
- 1 <= len(best_seller[i]) <= 100

## Example 1

### Input

best_seller = ["book1", "book1", "book2", "book1", "book3", "book1"]
k = 2

### Output

4

The subarray ["book1", "book1", "book2", "book1"] contains only 2 distinct
titles

## Example 2

### Input

best_seller = ["book1", "book2", "book3"]
k = 1

### Output

1

Each day has a different bestseller

## Example 3

### Input

best_seller = ["book1", "book1", "book1"]
k = 2

### Output

3

The entire array has only 1 distinct title
