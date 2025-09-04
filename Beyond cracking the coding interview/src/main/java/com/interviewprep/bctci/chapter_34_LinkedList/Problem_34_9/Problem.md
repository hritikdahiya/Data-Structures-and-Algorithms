# DOUBLY LINKED LIST TO ARRAY

## Problem statement

Given a non-null node, node, from a doubly linked list, which might or might not be the head, return an array with the
values in the list, from head to tail.

## Constraints

- You have to create the Node class with an integer val field and prev and next pointers.
- The list can contain up to 10^5 nodes.

## Example 1

### Input

head = null <-> 1 <-> 2 <-> 3 <-> 4 <-> null
node = a pointer to the node at index 2

### Output

[1, 2, 3, 4]

## Example 1

### Input

head = null <-> 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> null
node = a pointer to the node at index 0

### Output

[1, 2, 3, 4, 5]