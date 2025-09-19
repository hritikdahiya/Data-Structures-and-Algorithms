# IMPLEMENT A HEAP

## Problem statement

Assume your language does not support a heap or priority queue. Implement a Heap class from scratch with:

A constructor that receives an optional list of elements to be heapified, and
Operations size(), top(), push(elem), and pop().

This is the API:

```
initialize(higher_priority, heap):
  initializes a heap with the elements in `heap` (if any)
  sets higher_priority() as the method to compare element priorities
  higher_priority() should have this signature:
  higher_priority(x, y):
      returns true if x has higher priority than y, false otherwise

push(elem): adds an element to the priority queue.

pop(): removes and returns the highest-priority element.
If the heap is empty, return null.

top(): returns the highest-priority element without removing it.

size(): returns the number of elements in the priority queue
```

## Constraints

- The number of elements is at most 10^5
- If your language is typed, you can either make the type of the elements be generic, or use integers.
- You can either make it a min-heap or make it generic by receiving a comparator function, higher_priority, in the
  constructor.

## Example 1

```
heap = Heap(higher_priority: <)  # Min-heap
heap.push(4)  # Elements ordered by priority: 4
heap.push(8)  # Elements ordered by priority: 4, 8
heap.push(2)  # Elements ordered by priority: 2, 4, 8
heap.push(6)  # Elements ordered by priority: 2, 4, 6, 8
heap.push(1)  # Elements ordered by priority: 1, 2, 4, 6, 8
heap.pop()    # Returns 1. Elements ordered by priority: 2, 4, 6, 8
heap.pop()    # Returns 2. Elements ordered by priority: 4, 6, 8
heap.top()    # Returns 6. Elements ordered by priority: 6, 8
heap.pop()    # Returns 6. Elements ordered by priority: 8
heap.top()    # Returns 8. Elements ordered by priority: 8
heap.pop()    # Returns 8.
heap.size()   # Returns 0.
heap.top()    # Returns null.
heap.pop()    # Returns null.
```

## Example 2

```
heap = Heap(higher_priority: >, heap = [1, 8, 2, 6, 4])  # Max-heap
heap.top()     # Returns 8. Elements ordered by priority: 8, 6, 4, 2, 1
heap.pop()     # Returns 8. Elements ordered by priority: 6, 4, 2, 1
heap.pop()     # Returns 6. Elements ordered by priority: 4, 2, 1
heap.pop()     # Returns 4. Elements ordered by priority: 2, 1
```