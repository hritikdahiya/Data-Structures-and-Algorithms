# STRING JOIN

## Problem statement

Without using a built-in string join method, implement a `join(arr, s)` method, which receives an array of strings,
`arr`, and a string, `s`, and returns a single string consisting of the strings in `arr` with `s` in between them.

## Constraints

- 0 <= s.length <= 500
- 0 <= arr.length <= 10^5
- 0 <= arr[i].length <= 10^5
- the sum of the lengths of the strings in arr is at most 10^5

## Example 1

### Input

arr = ["join", "by", "space"]
s = " "

### Output

"join by space"

## Example 2

### Input

arr = ["b", "", "k", "", "p", "r n", "", "d", "d!!"]
s = "ee"

### Output

"beeeekeeeepeer neeeedeed!!"

## Example 3

### Input

arr = []
s = "x"

### Output

""