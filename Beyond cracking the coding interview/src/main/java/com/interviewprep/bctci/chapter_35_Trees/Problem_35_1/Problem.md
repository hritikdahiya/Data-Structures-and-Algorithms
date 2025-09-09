# ALIGNED CHAIN

## Problem statement

Given a binary tree, we say a node is aligned if its value is equal to its depth (distance from root). A descendant
chain is a sequence of nodes where each node is the parent of the next node. Return the length of the longest descendant
chain of aligned nodes. The chain does not need to start at the root.

## Constraints

- The number of nodes is at most 10^5
- The height of the tree is at most 500
- Each node has a value between 0 and 10^9

## Example 1

### Input

```
                7
               / \
              1   3
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

The longest descendant chain of aligned nodes is 1 -> 2 -> 3 on the left
subtree.