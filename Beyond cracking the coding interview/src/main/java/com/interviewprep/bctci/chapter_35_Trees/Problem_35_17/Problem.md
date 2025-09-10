# BST MERGE INTO ARRAY

## Problem statement

A binary search tree (BST) is a binary tree where, for every node:

- All the values on its left subtree are less than or equal to the node's value.
- All the values on its right subtree are greater than or equal to the node's value.

Given the roots of two binary search trees, return an array containing all elements from both trees in sorted order. The
trees may contain duplicate values.

## Constraints

- The number of nodes of each tree is at most 10^5
- The height of each tree is at most 500
- The value at each node is between 0 and 10^9

## Example 1

### Input

```
root1 =
              5
            /    \
           2      9
            \    / \
             4  9   11
root2 =
              3
            /    \
           2      7
          /      / \
         1      6   8
```

### Output

[1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 9, 11]

## Example 2

### Input

```
root1 =
              2
            /    \
           2      2

root2 =
              2
            /    \
           2      2
```

### Output

[2, 2, 2, 2, 2, 2]