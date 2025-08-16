# PREFIX-SUFFIX SWAP

## Problem statement

We are given an array of letters, arr, with a length, n, which is a multiple of 3. The goal is to modify arr in place to
move the prefix of length n/3 to the end and the suffix of length 2n/3 to the beginning.

## Constraints

- The length of arr is divisible by 3
- 0 ≤ arr.length ≤ 10^6
- arr[i] is a letter

## Example 1

### Input

arr = ['b', 'a', 'd', 'r', 'e', 'v', 'i', 'e', 'w']

### Output

['r', 'e', 'v', 'i', 'e', 'w', 'b', 'a', 'd']

Explanation: The first third (bad) moves to the end, while the rest (review)
stays in order.

## Example 2

### Input

arr = ['a', 'b', 'c']

### Output

['b', 'c', 'a']

## Example 3

### Input

arr = []

### Output

[]