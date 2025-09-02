# CUSTOM BRACKETS

## Problem statement

Given a string, s, and an array of strings, brackets, where each element consists of two characters, representing
matching opening and closing brackets, return whether s is balanced according to those brackets:

- Characters not in brackets do not affect whether s is balanced.
- A pair of matching brackets of one type cannot surround only half of a matching pair of another type of brackets.
- Assume that brackets does not contain any repeated characters.

## Constraints

- The length of s is at most 10^5
- The length of brackets is at most 10

## Example 1

### Input

s = "((a+b)*[c-d]-{e/f})"
brackets = ["()", "[]", "{}"]

### Output

True

## Example 2

### Input

s = "()[}"
brackets = ["()", "[]", "{}"]

### Output

False

## Example 3

### Input

s = "([)]"
brackets = ["()", "[]", "{}"]

### Output

False

## Example 4

### Input

s = "<div> hello :) </div>"
brackets = ["<>", "()"]

### Output

False

## Example 5

### Input

s = ")))(()(("
brackets = [")("]

### Output

True