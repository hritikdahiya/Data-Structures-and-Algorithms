# LARGEST SET INTERSECTION

## Problem statement

You are given a non-empty array, `sets`, where each element is an array of unique integers representing a set. The
intersection of a list of sets is the set of elements that appears in every set. Return the index of the set that should
be excluded to maximize the size of the intersection of the remaining sets. In case of a tie, return the smallest index.

## Constraints

- 1 ≤ sets.length ≤ 10^5
- 0 ≤ sets[i].length ≤ 10^5
- The total number of elements across all sets is at most 10^5
- All integers in each set are unique
- -10^9 ≤ sets[i][j] ≤ 10^9

## Example 1

### Input

sets = [[1, 2, 3], [3, 2, 1], [1, 4, 5], [1, 2]]

### Output

2

Explanation: Excluding the third set (index 2)
yields a set intersection of size 2: {1, 2}.

## Example 2

### Input

sets = [[1, 2], [3, 4], [5, 6]]

### Output

0

Explanation: The sets don't have any elements in common,
so the intersection will be empty regardless of which set you exclude.

## Example 3

### Input

sets = [[1, 2, 3], [4, 5]]

### Output

1

Explanation: After excluding a set, there will be only one set left,
so the intersection is the remaining set.

## Example 4

### Input

sets = [[1, 2, 3]]

### Output

0

Explanation: There is only one set, so after excluding it,
the intersection is empty.