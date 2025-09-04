# LINKED-LIST CYCLE DETECTION

## Problem statement

You are given the head of a singly linked list, head, that may or may not contain a cycle. A cycle happens when the next
pointer of a node is a node that is already in the linked list. Return whether the list has a cycle. Assume the list has
at least one node.

Follow-up: Can you do it using only O(1) extra space?

## Constraints

- You have to create the Node class with an integer val field and a next pointer.
- The list contains at least 1 node and at most 10^5 nodes.

## Example 1

### Input

```
1 -> 2 -> 3
     ^    |
     |    |
     \----/
```

### Output

True

## Example 1

### Input

1 -> 2 -> 3 -> null

### Output

False

## Example 1

### Input

```
1 -> 2 -> \
     ^    |
     |    |
     \----/
```

### Output

True