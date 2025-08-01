# 2-ARRAY 2-SUM    

## Problem statement

You are given two non-empty arrays of integers, sorted_arr and unsorted_arr. The ! rst one is sorted, but
the second is not. The goal is to find one element from each array with sum 0. If you can find them, return an
array with their indices, starting with the element in sorted_arr. Otherwise, return [-1, -1]. Use O(1)
extra space and do not modify the input.

## Example 1

### Input

sorted_arr = [-5, -4, -1, 4, 6, 6, 7]
unsorted_arr = [-3, 7, 18, 4, 6]

### Output

[1, 3]. 
We can use -4 from the sorted array and 4 from the
unsorted array.
