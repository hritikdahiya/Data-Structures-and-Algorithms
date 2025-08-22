# TIDE AERIAL VIEW

## Problem statement

You are provided a series of aerial-view pictures of the same coastal region, taken a few minutes apart from each other
around the time the tide rises. Each picture consists of an nxn binary grid, where 0 represents a part of the region
above water, and 1 represents a part below water.

The tide appears from the left side and rises toward the right, so, in each picture, for each row, all the 1's will be
before all the 0's. Once a region is underwater, it stays underwater. All pictures are different.
Determine which picture shows the most even balance between regions above and below water (i.e., where the number of 1's
most closely equals the number of 0's). In the event of a tie, return the earliest picture.

## Constraints

- 1 ≤ number of pictures ≤ 10^3
- all pictures have dimension nxn, where n ≤ 10^3

## Example 1

### Input

Picture 0:
[0, 0, 0]
[0, 0, 0]
[0, 0, 0]

Picture 1:
[1, 0, 0]
[0, 0, 0]
[1, 0, 0]

Picture 2:
[1, 1, 0]
[0, 0, 0]
[1, 0, 0]

Picture 3:
[1, 1, 0]
[1, 1, 1]
[1, 0, 0]

Picture 4:
[1, 1, 1]
[1, 1, 1]
[1, 1, 0]

### Output

2

The pictures at index 2 and 3 are equally far from having 50%
water. We break the tie by picking the earlier one, 2.

## Example 2

### Input

Picture 0:
[1, 1]
[1, 1]

### Output

0

It's the only picture.