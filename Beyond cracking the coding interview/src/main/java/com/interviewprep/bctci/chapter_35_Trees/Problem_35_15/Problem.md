# BST DUPLICATE DETECTION

## Problem statement

A binary search tree (BST) is a binary tree where, for every node:

- All the values on its left subtree are less than or equal to the node's value.
- All the values on its right subtree are greater than or equal to the node's value.

Given the root of a binary search tree, determine if it contains any duplicate values.

## Constraints

- The number of nodes is at most 10^5
- The height of the tree is at most 500
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

### Output

true