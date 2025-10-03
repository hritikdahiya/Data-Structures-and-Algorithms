# SUPERSEQUENCE

## Problem statement

A supersequence of a string s is another string that contains all the same letters of s in the same relative order. For
instance, "aabbcc" is a supersequence of "abc", but not of "bca".

Given a non-empty array of strings, arr, where each string consists only of lowercase English letters, determine if it
is possible to construct a single supersequence of all the strings in arr such that no letter appears more than once.
Return true if such a supersequence exists and false otherwise.

## Constraints

- The length of each string is at most 100
- Each string consists of lowercase English letters

## Example 1

### Input

arr = ["abc", "bde", "df", "cfe"]

### Output

True.

"abcdfe" is a supersequence.

## Example 2

### Input

arr = ["ab", "ba"]

### Output

False.

Any supersequence would have to

- include 'a' twice (like "aba") or
- include 'b' twice (like "bab").

## Example 3

### Input

arr = ["aa"]

### Output

False.