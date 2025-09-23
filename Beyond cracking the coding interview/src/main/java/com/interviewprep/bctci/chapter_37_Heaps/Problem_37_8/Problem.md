# SUM OF FIRST K PRIME NUMBERS

## Problem statement

Given a non-empty array, primes, of distinct prime numbers, and a positive number k, return the sum of the first k
numbers that are a positive power of a number in primes.

If the answer is larger than 10^9+7, return it modulo 10^9+7.

## Constraints

- 1 <= primes.length <= 10^4
- Each element in primes is a distinct prime number
- 0 <= k <= 10^6

## Example 1

### Input

primes = [2]
k = 1

### Output

2

The first positive power of 2 is 2^1 = 2.

## Example 2

### Input

primes = [5]
k = 3

### Output

155

The first 3 positive powers of 5 are 5, 25, and 125.

## Example 3

### Input

primes = [2, 3]
k = 7

### Output

69

The first 7 numbers that are a positive power of 2 or 3 are 2, 3, 4, 8, 9, 16,
and 27.