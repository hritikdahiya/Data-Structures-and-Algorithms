# REVERSE CASE MATCH

## Problem statement

Given a string, s, where half of the letters are lowercase and half uppercase, return whether the word formed by the
lowercase letters is the same as the reverse of the word formed by the uppercase letters. Assume that the length, n, is
even.

## Constraints

- 0 ≤ s.length ≤ 10^6
- s contains only uppercase and lowercase English letters

## Example 1

### Input

s = "haDrRAHd"

### Output

True.

Explanation:

- Lowercase letters: "hard"
- Uppercase letters: "DRAH"
- When reversed, "DRAH" becomes "HARD", which matches "hard" ignoring case.

## Example 2

### Input

s = "haHrARDd"

### Output

False.

Explanation:

- Lowercase letters: "hard"
- Uppercase letters: "HARD"
- When reversed, "HARD" becomes "DRAH", which doesn't match "hard".

## Example 3

### Input

s = "BbbB"

### Output

True.

Explanation:

- Lowercase letters: "bb"
- Uppercase letters: "BB"
- When reversed, "BB" becomes "BB", which matches "bb" ignoring case.