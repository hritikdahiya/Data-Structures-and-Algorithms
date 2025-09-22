# MOST LISTENED ACROSS GENRE

## Problem statement

You are given an array, genres, of length m, where each element is an array of songs from a given genre. Each song
consists of a [title, plays] pair.

- Each list is non-empty and already sorted from most to least played songs.
- There are n > 0 songs in total, and each song appears in at most one list.

You are also given a positive integer k satisfying 1 <= k <= n. Return the titles of the top k most-listened songs
across all genres, in order from most to least listened. It doesn't matter how you break ties.

## Constraints

- The length of genres, m, is at least 1 and at most 10^5.
- The total number of songs, n, is at least 1 and at most 10^5.
- Song titles are unique and have at most 50 characters.
- Each genre list is already sorted from most to least played songs (there can be ties).
- 1 <= k <= n.

## Example 1

### Input

```
genres = [
    [ # Pop
        ["Coding In The Deep", 123],
        ["Someone Like GNU", 99],
        ["Hello World", 98]
    ],
    [ # Country
        ["Ring Of Firewalls", 217]
    ],
    [ # Rock
        ["Boolean Rhapsody", 184],
        ["Merge Together", 119],
        ["Hey Queue", 102]
    ]
]
```

k = 5

### Output

```
[
    "Ring Of Firewalls",
    "Boolean Rhapsody",
    "Coding In The Deep",
    "Merge Together",
    "Hey Queue"
]
```