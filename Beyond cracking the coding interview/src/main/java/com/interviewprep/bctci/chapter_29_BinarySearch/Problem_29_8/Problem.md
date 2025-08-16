# SEARCH IN HUGE ARRAY

## Problem statement

We are trying to search for a target integer, target, in a sorted array of positive integers (duplicates allowed)
that is too big to fit into memory. We can only access the array through an API, fetch(i), which returns the
value at index `i` if `i` is within bounds or -1 otherwise. Using as few calls to the API as possible, return the
index of the target, or -1 if it does not exist. If the target appears multiple times, return any of the indices.
There is no API to get the array's length.