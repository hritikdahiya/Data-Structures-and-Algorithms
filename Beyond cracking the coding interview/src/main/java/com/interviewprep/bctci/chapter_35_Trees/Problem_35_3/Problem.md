# ALIGNED PATH

## Problem statement

Given a binary tree, we say a node is aligned if its value is equal to its depth (distance from root). Return the length
of the longest path of aligned nodes. A path can start and end at any node.

## Constraints

- The number of nodes is at most 10^5
- The height of the tree is at most 500
- Each node has a value between 0 and 10^9

## Example 1

### Input

```
                7
               / \
              1   4
             / \   \
            2   8   2
           / \     / \
          4   3   3   3
```

### Output

3
The aligned nodes are the circled ones:

```
Depth
  0             7
               / \
  1          (1)   3
             / \   \
  2        (2)  8  (2)
           / \     / \
  3       4  (3) (3) (3)
```

There are two paths of aligned nodes with maximum length: 1 -> 2 -> 3 on the
left subtree, and 3 -> 2 -> 3 on the right subtree.