# K MOST PLAYED

## Problem statement

You are given a list of (title, plays) tuples where the first element is the name of a song, and the second is the
number of times the song has been played. You are also given a positive integer k. Return the k most played songs from
the list, in any order.

- If the list has fewer than k songs, return all of them.
- Break ties in any way you want.
- You can assume that song titles have a length of at most 50.

Can you solve it using only O(k) space?

## Constraints

- The length of songs is at most 10^5
- Each element in songs is a tuple with a string and an integer
- All song titles are unique
- The length of the string in each song is at most 50
- 1 <= k <= 10^5

## Example 1

### Input

songs = [["All the Single Brackets", 132],
["Oops! I Broke Prod Again", 274],
["Coding In The Deep", 146],
["Boolean Rhapsody", 193],
["Here Comes The Bug", 291],
["All About That Base Case", 291]]

k = 3

### Output

["All About That Base Case", "Here Comes The Bug", "Oops! I Broke Prod
Again"]. Any order of these (excellent) songs would be valid.