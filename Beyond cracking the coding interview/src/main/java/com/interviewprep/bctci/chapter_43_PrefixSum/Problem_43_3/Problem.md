# EXCLUSIVE PRODUCT

## Problem statement

Given an array of non-negative integers, arr, return an array with the same length where index i contains the product of
all the elements in arr except arr[i]. Since the values could be very large, return them modulo 10^9 + 7.

Note: the "obvious" solution is to compute the total product and then divide it by each element. However, the total
product could be up to 10000^n = 10^4000000. Even if your language supports arbitrary integers, we don't want to work
with numbers that large (at that point, arithmetic operations are not 'constant time' anymore).

Instead, we should use the fact that, instead of applying modulo at the end, we can apply at each step without affecting
the final result. This will keep any products we compute below 10^9 + 7. However, applying the modulo at each step only
works for addition, subtraction, and multiplication, not division. Dividing first and then applying modulo yields
different results than applying modulo and then dividing: (12 / 3) % 5 != (12 % 5) / 3.

This means that we need to find a way to solve this problem without using division at the end.

## Constraints

- For any i, 0 ≤ arr[i] ≤ 10000.
- 2 ≤ n ≤ 10^6, where n is the length of arr.

## Example 1

### Input

arr = [1, 3, 2, 1]

### Output

[6, 2, 3, 6]

## Example 2

### Input

arr = [0, 1, 0]

### Output

[0, 0, 0]
