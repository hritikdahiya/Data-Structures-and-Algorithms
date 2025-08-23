# WORD EXPANSION CLASS

## Problem statement

Implement a class, Checker, that receives a string s upon initialization. The class must support a method, expands_into(
s2), which takes another string and checks if s2 can be formed by adding exactly one letter to s1 and reordering the
letters. All letters in both strings are lowercase alphabetical characters.

## Constraints

- The length of s and s2 is at most 10^5
- All characters are lowercase English letters

## Example 1

checker = Checker("tea")
print(checker.expands_into("tea"))   # returns False
print(checker.expands_into("team"))  # returns True
print(checker.expands_into("seam"))  # returns False

## Example 2

checker = Checker("on")
print(checker.expands_into("nooo"))  # returns False
print(checker.expands_into("not"))   # returns True
print(checker.expands_into("now"))   # returns True

## Example 3

checker = Checker("")
print(checker.expands_into("a"))     # returns True
print(checker.expands_into(""))      # returns False
print(checker.expands_into("ab"))    # returns False