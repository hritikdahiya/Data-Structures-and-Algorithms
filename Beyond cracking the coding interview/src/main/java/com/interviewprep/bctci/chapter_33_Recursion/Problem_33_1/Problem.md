# ROBOT INSTRUCTIONS

## Problem statement

We are given a string, seq, with a sequence of instructions for a robot. The string consists of characters 'L', 'R',
and '2'. The letters 'L' and 'R' instruct the robot to move left or right.

The character '2' (which never appears at the end of the string) means "perform all the instructions after this '2'
twice, but skip the instruction immediately following the '2' during the second repetition." Output a string with the
final list of left and right moves that the robot should do.

## Constraints

- The length of seq is at most 10^4
- seq consists only of the characters 'L', 'R', and '2'
- '2' never appears at the end of seq

## Example 1

### Input

seq = "LL"

### Output

"LL"

## Example 2

### Input

seq = "2LR"

### Output

"LRR".

The '2' indicates that we need to do "LR" first and then "R".

## Example 3

### Input

seq = "2L"

### Output

"L".

The '2' indicates that we need to do "L" first and then "" (the
empty string).

## Example 4

### Input

seq = "22LR"

### Output

"LRRLR".

The first '2' indicates that we need to do "2LR" first and
then "LR".

## Example 5

### Input

seq = "LL2R2L"

### Output

"LLRLL"