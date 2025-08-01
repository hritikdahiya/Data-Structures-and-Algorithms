# Cctv footage

## Problem statement

You are given an API called `is_stolen(t)` which takes a timestamp as input and returns True if the bike
is missing at that timestamp and False if it is still there. You're also given two timestamps, `t1` and `t2`,
representing when you parked the bike and when you found it missing. Return the timestamp when the
bike was first missing, minimizing the number of API calls. Assume that 0 < `t1` < `t2`, `is_stolen(t1)` is
False, and `is_stolen(t2)` is True.

### Variation  - Deck Cut

You're given an array that contains each number from 1 to 52 once, representing a deck of playing cards.
The deck started in order, but it was then "cut," meaning that a random number of cards was taken from the
top (the front of the array) and moved as a block to the bottom (the back of the array). Determine the index
where you must "cut" the deck again to return to sorted order (that is, the index with the 52).
[36, 37, 38, ..., 50, 51, 52, 1, 2, 3, ..., 33, 34, 35]

Do it via Binary search, not the obvious solution i.e. 52 - deck[0]
