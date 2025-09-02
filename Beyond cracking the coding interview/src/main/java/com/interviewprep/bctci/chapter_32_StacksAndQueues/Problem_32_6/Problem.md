# BALANCED PARTITION

## Problem statement

Given a balanced parentheses string, s, a balanced partition is a partition of s into substrings, each of which is
itself balanced. Return the maximum possible number of substrings in a balanced partition.

## Constraints

- The length of s is at most 10^5
- s consists only of '(' and ')'

## Example 1

### Input

s = "((()))(()())()(()(()))"

### Output

The balanced partition with the most substrings is "((()))",
"(()())", "()", "(()(()))".