# MAKE PLAYLIST

## Problem statement

Imagine your picky friends give you a list of song–artist tuples to create a playlist. Your task is to reorder the songs
so that no two songs by the same artist are played back-to-back. If it's not possible, return an empty list.

## Constraints

- The number of songs, n, is at most 10^5.
- Each element in songs is a tuple with two strings.
- Song and artist names have at most 100 characters.

## Example 1

### Input

```
songs = [["Coding In The Deep", "A Dell"],
         ["Hello World", "A Dell"],
         ["Someone Like GNU", "A Dell"],
         ["Make You Read My Logs", "A Dell"],
         ["Hey Queue", "The Bugs"],
         ["Here Comes the Bug", "The Bugs"],
         ["Merge Together", "The Bugs"],
         ["Dirty Data", "Michael JSON"],
         ["Man in the Middle Attack", "Michael JSON"],
         ["Ring Of Firewalls", "Johnny Cache"]]
```

### Output

```
[
  "Coding In The Deep",         // A Dell
  "Hey Queue",                  // The Bugs
  "Hello World",                // A Dell
  "Dirty Data",                 // Michael JSON
  "Someone Like GNU",           // A Dell
  "Here Comes the Bug",         // The Bugs
  "Make You Read My Logs",      // A Dell
  "Man in the Middle Attack",   // Michael JSON
  "Merge Together",             // The Bugs
  "Ring Of Firewalls"           // Johnny Cache
]
```