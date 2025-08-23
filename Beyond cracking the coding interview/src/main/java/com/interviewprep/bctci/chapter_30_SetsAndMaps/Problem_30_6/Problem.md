# SETS AND MAPS

## Problem statement

Given an array of unique integers, arr, return a list with all pairs of indices, [i, j], such that arr[i]^2 == arr[j].
You can return the pairs in any order.

## Constraints

- The length of arr is at most 10^6
- 1 ≤ arr[i] ≤ 10^9
- All elements in arr are unique

## Example 1

### Input

arr = [4, 10, 3, 100, 5, 2, 10000]

### Output

[[5, 0], [1, 3], [3, 6]].

The 3 pairs of values that satisfy the
constraint are (2, 4), (10, 100), and (100, 10000). We return [5, 0] because
arr[5] is 2 and arr[0] is 4, and similarly for the other two pairs. Other
orders like [[1, 3], [0, 5], [3, 6]] would also be valid.

## Example 2

### Input

arr = [1]

### Output

[[0, 0]].
Since 1 is its own square, a 1 forms a pair with itself.