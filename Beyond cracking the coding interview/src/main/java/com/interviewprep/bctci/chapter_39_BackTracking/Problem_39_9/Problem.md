# COUNT UNIQUE SUBSETS WITH SUM ZERO

## Problem statement

A multiset is a set that allows repeated elements. A submultiset of a multiset S is another multiset obtained by
removing any number of elements from S.

We are given an array with n integers representing a multiset (it can have duplicates).

Return the number of unique submultisets of S with sum 0, ignoring which position in S the values came from.

## Constraints

- The length of S is at most 20.
- The elements in S are integers.

## Example 1

### Input

S = [1, 1, -1, -1]

### Output

3

The unique submultisets with sum 0 are [], [1, 1, -1, -1] and [1,
-1]. The last one can be obtained in more than one way.

## Example 2

### Input

S = []

### Output

1

[] is a submultiset of [] with sum 0.

## Example 3

### Input

S = [-1, 2, 1, 0, 3]

### Output

4

The unique submultiset with sum 0 are [-1, 1], [-1, 1, 0], [0], and
[].