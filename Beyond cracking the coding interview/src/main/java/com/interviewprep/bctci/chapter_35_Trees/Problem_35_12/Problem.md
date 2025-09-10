# BST SEARCH

## Problem statement

A binary search tree (BST) is a binary tree if, for every node:

- All the values on its left subtree are less than or equal to the node's value.
- All the values on its right subtree are greater than or equal to the node's value.

Given the root of a binary search tree and a value, target, return true if the tree contains the target value, and false
otherwise.

## Constraints

- The number of nodes is at most 10^5
- The value at each node is between 0 and 10^9

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

true

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

false

The value 3 does not exist in the tree.