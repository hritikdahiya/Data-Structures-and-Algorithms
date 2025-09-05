# REMOVE KTH NODE FROM THE END

## Problem statement

Given the head of a singly linked list, head, and a number k, remove the k-th node from the end of the list. Assume k is
smaller than or equal to the list's size.

Follow-up: Can you do it without computing the length of the list first?

## Constraints

- You have to create the Node class with an integer val field and a next pointer.
- The list contains at least 1 node and at most 10^5 nodes.
- 1 <= k <= n, where n is the number of nodes in the list.

## Example 1

### Input

head = 1 -> 2 -> 3 -> 4 -> null
k = 2

### Output

1 -> 2 -> 4 -> null

## Example 2

### Input

head = 1 -> 2 -> 3 -> 4 -> null
k = 4

### Output

2 -> 3 -> 4 -> null

## Example 3

### Input

head = 1 -> null
k = 1

### Output

null