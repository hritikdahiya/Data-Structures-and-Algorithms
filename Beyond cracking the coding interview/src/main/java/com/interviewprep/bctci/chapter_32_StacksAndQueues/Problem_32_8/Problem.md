# LONGEST BALANCED SUBSEQUENCE

## Problem statement

Given a string of parentheses, s, return the longest balanced subsequence.

A subsequence of s (not a subarray) is a string obtained by removing some of the letters in s. In other words, you have
to delete the smallest number of characters necessary to make s balanced and return the resulting string. There may be
more than one valid answer.

## Constraints

- 0 <= s.length <= 10^5
- s consists only of '(' and ')'

## Example 1

### Input

s = "))(())(()"

### Output

"(())()"

We removed the following characters:

```
") ) ( ( ) ) ( ( )".
 ^ ^         ^
```

We could have also removed

```
") ) ( ( ) ) ( ( )"
 ^ ^           ^
```

## Example 2

### Input

s = "(()()"

### Output

"()()"

We removed the following character:

```
"( ( ) ( )"
 ^
```

We could have also removed

```
"( ( ) ( )"
       ^
```

So "(())" is also a valid output.

## Example 3

### Input

s = "())(()"

### Output

"()()"

We removed the following characters:

```
"( ) ) ( ( )"
     ^ ^
```

There are several other ways to reach the same answer. For example, we could
have also removed

```
"( ) ) ( ( )"
   ^     ^
```

## Example 4

### Input

s = "("

### Output

""