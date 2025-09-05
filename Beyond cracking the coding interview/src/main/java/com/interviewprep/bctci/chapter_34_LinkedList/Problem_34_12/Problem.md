# LINKED-LIST ZIP

## Problem statement

Given the heads of two singly linked lists, head1 and head2, merge them together by alternating one node from each,
starting with head1. If lists are not the same size, append any remaining elements to the end. Modify the lists in place
without creating new nodes. Return the new head.

## Constraints

- You have to create the Node class with an integer val field and a next pointer.
- The lists can contain up to 10^5 nodes.

## Example 1

### Input

head1 = 1 -> 3 -> 5 -> null
head2 = 2 -> 4 -> 6 -> null

### Output

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

## Example 2

### Input

head1 = 1 -> 2 -> 3 -> 4 -> null
head2 = 8 -> 7 -> null

### Output

1 -> 8 -> 2 -> 7 -> 3 -> 4 -> null

## Example 3

### Input

head1 = null
head2 = null

### Output

null