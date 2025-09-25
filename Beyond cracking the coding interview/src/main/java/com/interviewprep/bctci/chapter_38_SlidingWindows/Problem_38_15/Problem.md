# SHORTEST WITH ALL LETTERS

## Problem statement

Given a string, s1, and a shorter but non-empty string, s2, return the length of the shortest substring of s1 that has
every letter in s2 at least as many times as they appear in s2. If there is no such substring, return -1.

## Constraints

- 2 <= len(s1) <= 10^5
- 1 <= len(s2) < len(s1)
- All characters are lowercase English letters

## Example 1

### Input

s1 = "helloworld", s2 = "well"

### Output

5

The substring "ellow" in s1 has all the letters in s2.

## Example 2

### Input

s1 = "helloworld", s2 = "weelll"

### Output

-1

s1 does not have 2 e's.