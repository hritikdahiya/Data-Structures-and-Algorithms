# SUBSET ENUMERATION

## Problem statement

Given a set of elements, S, a subset of S is another set obtained by removing any number of elements from S (including
none or all of them). As usual with sets, order does not matter.

Given an array of unique characters, S, return all possible subsets in any order.

## Constraints

- The elements in S are unique.
- The length of S is at most 12.

## Example 1

### Input

S = ['x', 'y', 'z']

### Output

[
[],
['x'],
['y'],
['z'],
['x', 'y'],
['x', 'z'],
['y', 'z'],
['x', 'y', 'z']
]