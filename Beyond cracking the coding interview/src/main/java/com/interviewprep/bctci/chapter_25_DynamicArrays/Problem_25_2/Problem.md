# EXTEND DYNAMIC ARRAY

## Problem statement

Building off of an existing dynamic array data structure, which already has append, pop_back, set, get, and size methods, and adding additional methods. Please refer to the Implement Dynamic Array problem first.

Add the following methods:

- `pop(i)`: Removes the element at index i. Every element after that index should be shifted left by one index so that there are no gaps remaining in the fixed-size array. Returns the element removed.
- `contains(x)`: Takes an element and returns whether the element appears in the array.
- `insert(i, x)`: Takes an index and an element and adds the element at that index, shifting right any preexisting elements at index i or greater.
- `remove(x)`: Takes in an element and removes the first instance of that element in the array. Returns the index that the element was at or -1 if the element was not found.