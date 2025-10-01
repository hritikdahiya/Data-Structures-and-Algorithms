# LONGEST COMMON SUBSEQUENCE

## Problem statement

Given two strings, s1 and s2, return the length of the longest common subsequence that is common to s1 and s2. A
subsequence of a string s is a sequence of characters that appears in s in the same relative order but not necessarily
consecutively. The two strings consist of uppercase English letters only.

## Constraints

- The length of each string is at least 0 and at most 1000.
- The two strings consist of uppercase English letters only.

## Example 1

### Input

s1 = "HAHAH"
s2 = "AAAAHH"

### Output

3

There are two common subsequences of length 3: "AAH" and "AHH".

## Example 2

### Input

s1 = ""
s2 = "AA"

### Output

0

## Example 3

### Input

s1 = "ABC"
s2 = "BCA"

### Output

2

The longest common subsequence is "BC".