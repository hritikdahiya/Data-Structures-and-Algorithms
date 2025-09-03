# POWERS MOD M

## Problem statement

Given three integers a > 1, p ≥ 0, and m > 1, compute a^p % m while avoiding storing intermediate values much larger
than m.

The basic recurrence relation for powers is:

- a^0 = 1
- For p > 0, a^p = a * a^(p-1)

When it comes to the modulo operation, we can apply it at each step without affecting the result:

- a^0 % m = 1
- For p > 0, a^p % m = (a * (a^(p-1) % m)) % m

## Constraints

- 1 < a ≤ 10^9
- 0 ≤ p ≤ 10^9
- 1 < m ≤ 10^9

## Example 1

### Input

a = 2
p = 5
m = 100

### Output

32

## Example 2

### Input

a = 2
p = 5
m = 30

### Output

2

## Example 3

### Input

a = 123456789
p = 987654321
m = 1000000007

### Output

652541198

## Example 4

### Input

a = 3
p = 1
m = 5

### Output

3

## Example 5

### Input

a = 5
p = 3
m = 7

### Output

6