# MINIVAN ROAD TRIP

## Problem statement

We are driving down a road with n rest stops between us and our destination. For each rest stop, our mapping software
tells us how long of a detour it would be to stop there. We start before the first rest stop and our destination is past
the last one.

We are given an array of n positive integers, times, indicating the delay incurred to stop at each rest stop. We are
also given a positive integer k, indicating the number of consecutive rest areas we can skip.

If we don't want to go more than k rest stops without taking a break, what's the least amount of time we have to spend
on detours?

## Constraints

- n is at least 0 and at most 1000.
- times[i] is at least 1 and at most 1000.
- k is at least 1 and at most 1000.

## Example 1

### Input

### Output

## Example 1

### Input

times = [8, 1, 2, 3, 9, 6, 2, 4]
k = 2

### Output

6

The optimal rest stops are: [8, *1*, 2, *3*, 9, 6, *2*, 4].

## Example 2

### Input

times = [8, 1, 2, 3, 9, 6, 2, 4]
k = 3

### Output

4

The optimal rest stops are: [8, 1, *2*, 3, 9, 6, *2*, 4].

## Example 3

### Input

times = [10, 10]

k = 2

### Output

0
