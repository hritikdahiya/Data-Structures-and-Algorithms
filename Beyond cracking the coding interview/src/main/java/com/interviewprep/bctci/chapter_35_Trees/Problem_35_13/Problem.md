# BST NEAREST VALUE

## Problem statement

A binary search tree (BST) is a binary tree if, for every node:

- All the values on its left subtree are less than or equal to the node's value.
- All the values on its right subtree are greater than or equal to the node's value.

Given the root of a non-empty binary search tree and a value, target, find the closest value to target in the tree. In
case of a tie, return the smaller value.

## Constraints

- 1 <= number of nodes <= 10^4
- -10^9 <= node.val <= 10^9
- -10^9 <= target <= 10^9
- The tree is a valid binary search tree

## Example 1

### Input

```
              5
            /    \
           2      9
            \    / \
             4  9   11
                 \
                  9
```

target = 4

### Output

4

## Example 2

### Input

```
              5
            /    \
           2      9
            \    / \
             4  9   11
                 \
                  9
```

target = 3

### Output

2