# SORTING BY FREQUENCY

## Problem statement

Given a string, word, consisting of lowercase letters only, return a sorted array with all the letters in word sorted
from most frequent to least frequent. If two frequencies are the same, break the tie alphabetically.

## Constraints

- The length of word is at most 10^5
- word contains only lowercase letters

## Example 1

### Input

word = "supercalifragilisticexpialidocious"

### Output

['i', 'a', 'c', 'l', 's', 'e', 'o', 'p', 'r', 'u', 'd', 'f', 'g', 't',
'x']

## Example 2

### Input

word = "aabbbcccc"

### Output

['c', 'b', 'a'].

'c' appears 4 times, 'b' appears 3 times, and 'a'
appears 2 times.

## Example 3

### Input

word = "abc"

### Output

['a', 'b', 'c'].

All letters appear once, so they are sorted
alphabetically.
