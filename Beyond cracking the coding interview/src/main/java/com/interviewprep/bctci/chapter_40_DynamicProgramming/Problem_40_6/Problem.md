# MINIMUM STEPS TO ONE

## Problem statement

Write a function that accepts a positive integer, n, and returns the minimum number of operations to get to 1, assuming
we can choose between the following operations:

- Subtract 1.
- Divide by 2. We can only do this if the number is divisible by 2.
- Divide by 3. We can only do this if the number is divisible by 3.

## Constraints

- n is at least 1 and at most 10^6.

## Example 1

### Input

n = 10

### Output

3

We can do 10 -> 9 -> 3 -> 1.

## Example 2

### Input

n = 1

### Output

0

## Example 3

### Input

n = 15

### Output

4