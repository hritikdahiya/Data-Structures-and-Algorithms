# RESTAURANT RATINGS

## Problem statement

We are doing a road trip and trying to plan where to stop to eat. There are n restaurants along the route. We are given
an array, ratings, with the ratings of all the restaurants maximizing the sum of ratings of the places where we stop.
The only constraint is that we don't want to stop at 2 consecutive restaurants, as we would be too full. Return the
optimal sum of ratings.

## Constraints

- n is at least 0 and at most 10^6.
- ratings[i] is a floating-point number between 0 and 10 (inclusive).

## Example 1

### Input

ratings = [8, 1, 3, 9, 5, 2, 1]

### Output

19

The optimal restaurants are: [**8**, 1, 3, **9**, 5, **2**, 1]

## Example 1

### Input

ratings = [8, 1, 3, 7, 5, 2, 4]

### Output

20

The optimal restaurants are: [**8**, 1, **3**, 7, **5**, 2, **4**].

## Example 1

### Input

ratings = []

### Output

0