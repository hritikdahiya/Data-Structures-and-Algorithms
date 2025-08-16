# STRING SPLIT

## Problem statement

Without using a built-in string split method, implement a `split(s, c)` method, which receives a string `s` and a character
`c` and splits `s` at each occurrence of `c`, returning a list of strings.

## Constraints

- The length of the input string is at most 10^6
- The delimiter is a single character

## Example 1

### Input
s = "split by space"
c = ' '

### Output
["split", "by", "space"]


## Example 2

### Input
s = "beekeeper needed"
c = 'e'

### Output
["b", "", "k", "", "p", "r n", "", "d", "d"]

## Example 3

### Input
s = "/home/./..//Documents/" 
c = '/'

### Output
["", "home", ".", "..", "", "Documents", ""]

## Example 4

### Input
s = ""
c = '?'

[]