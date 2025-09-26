# COUNT SUBARRAYS WITH DROPS

## Problem statement

Given an array, arr, of integers and a number k, count how many subarrays have:

1. at most k drops
2. exactly k drops
3. at least k drops

A drop is a sequence of two consecutive numbers where the first is larger than the second.

Return an array with the three values.

## Constraints

- 0 <= arr.length <= 10^5
- -10^9 <= arr[i] <= 10^9
- 0 <= k <= 10^5

## Example 1

### Input

arr = [1, 2, 3],
k = 1

### Output

[6, 0, 0]

- The array has 6 subarrays: [1], [2], [3], [1, 2], [2, 3], and [1, 2, 3].
- At most k drops:  6. The array has no drops, so every subarray has 0 drops.
- Exactly k drops:  0. The array has no drops.
- At least k drops: 0. The array has no drops.

## Example 2

### Input

arr = [3, 2, 1],
k = 1

### Output

[5, 2, 3]

- The array has 6 subarrays: [3], [2], [1], [3, 2], [2, 1], and [3, 2, 1].
- At most k drops:  5. [3, 2] and [2, 1] have 1 drop and [3], [2], and [1]
  have 0 drops.
- Exactly k drops:  2. [3, 2] and [2, 1] have exactly 1 drop.
- At least k drops: 3. [3, 2] and [2, 1] have 1 drop and [3, 2, 1] has 2 drops.

## Example 3

### Input

arr = [5, 4, 3, 2, 1],
k = 2

### Output

[10, 3, 5]

- The array has 5 + 4 + 3 + 2 + 1 = 15 subarrays.
- At most k drops: 10. All single elements and pairs of elements.
- Exactly k drops:  3. [5, 4, 3], [4, 3, 2], and [3, 2, 1].
- At least k drops: 5. The three subarrays from (2) plus [5, 4, 3, 2] and [5,
  4, 3, 2, 1].