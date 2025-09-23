# ENDURING BEST SELLER STREAK

## Problem statement

We are given an array, best_seller, with the title of the most sold book for each day over a given period. We are also
given a number k with 1 ≤ k ≤ len(sales).

We need to return whether there is any k-day period where every day has the same best-selling title.

## Constraints

- The length of best_seller is at most 10^6
- Each book title has length at most 100
- 1 <= k <= len(best_seller)

## Example 1

### Input

best_seller = ["book3", "book1", "book3", "book3", "book2"]
k = 3

### Output

False

No three consecutive days have the same bestseller.

## Example 2

### Input

best_seller = ["book3", "book1", "book3", "book3", "book2"]
k = 2

### Output

True

Days 3-4 have the same bestseller "book3".

## Example 3

### Input

best_seller = ["book1", "book2", "book1"]
k = 2

### Output

False

No two consecutive days have the same bestseller.

## Example 4

### Input

best_seller = ["book1", "book1", "book1"]
k = 3

### Output

True

The entire array has the same bestseller.