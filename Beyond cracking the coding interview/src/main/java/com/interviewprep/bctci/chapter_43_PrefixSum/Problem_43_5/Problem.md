# YOUTUBE VIDEO UNUSUAL DAYS

## Problem statement

A YouTuber has fetched the number of likes and dislikes of a video each day since its publication, with the goal of
finding days with unusually high or low like-to-dislike ratios.

We are given two arrays, likes and dislikes, of length n, representing the likes and dislikes on each day.

The reception score of a day is the number of likes minus the number of dislikes. The deviation between two days is the
absolute value of the difference in their reception scores. The total deviation of a given day is the sum of the
deviations between it and every other day.

Find the highest total deviation of any day and return it.

## Constraints

- The length of likes and dislikes is at most 10^5
- Each element in likes and dislikes is a non-negative integer less than 10^4

## Example 1

### Input

likes = [3, 6, 1]
dislikes = [0, 1, 9]

### Output

24

The reception scores are [3, 5, -8]. The total deviation of each day is:
day 0: |3 - 5| + |3 - (-8)| = 2 + 11 = 13
day 1: |5 - 3| + |5 - (-8)| = 2 + 13 = 15
day 2: |-8 - 3| + |-8 - 5| = 11 + 13 = 24
