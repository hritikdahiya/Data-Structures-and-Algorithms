# RECONSTRUCT LONGEST COMMON SUBSEQUENCE

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

"AAH". The other valid output is "AHH".

## Example 2

### Input

s1 = ""
s2 = "AA"

### Output

""

## Example 3

### Input

s1 = "ABCD"
s2 = "ACBAD"

### Output

"ACD". The other valid output is "ABD".