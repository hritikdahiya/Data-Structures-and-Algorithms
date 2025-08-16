# TARGET COUNT DIVISIBLE BY K

## Problem statement

Given a sorted array of integers, arr, a target value, target, and a positive integer, k, return whether the
number of occurrences of the target in the array is a multiple of k.

## Example 1

### Input

arr = [1, 2, 2, 2, 2, 2, 2, 3]
target = 2 
k = 3

### Output

True. 
2 occurs 6 times, which is a multiple of 3.

## Example 2

### Input

arr = [1, 2, 2, 2, 2, 2, 2, 3]
target = 2
k = 4

### Output

False. 
2 occurs 6 times, which is not a multiple of 4.

## Example 3

### Input

arr = [1, 2, 2, 2, 2, 2, 2, 3]
target = 4
k = 3

### Output

True.
4 occurs 0 times, and 0 is a multiple of any number.