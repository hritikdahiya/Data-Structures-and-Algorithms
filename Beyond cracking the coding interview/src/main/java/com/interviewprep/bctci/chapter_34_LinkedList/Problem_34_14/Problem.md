# LINKED LIST BLOCK REVERSAL

## Problem statement

Given the head of a singly linked list, head, and a number k > 0, reverse blocks of k nodes of the linked list. If the
last block has size less than k, do not reverse it.

## Constraints

- You have to create the Node class with an integer val field and a next pointer.
- The list can contain up to 10^5 nodes.

## Example 1

### Input

head = 1 -> 2 -> 3 -> 4 -> null
k = 2

### Output

2 -> 1 -> 4 -> 3 -> null

## Example 2

### Input

head = 1 -> 2 -> 3 -> 4 -> 5 -> null
k = 3

### Output

3 -> 2 -> 1 -> 4 -> 5 -> null

## Example 3

### Input

head = 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
k = 2

### Output

2 -> 1 -> 4 -> 3 -> 6 -> 5 -> null