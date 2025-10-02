# ALL OVERBOOKED SLOTS

## Problem statement

In a mock interview booking system, there is a list of n time slots available to book interviews. We are given:

- An array, slots, of length n > 0, where slots[i] is the number of bookings already made for slot i.
- An array, bookings, of length k >= 0, where each element represents a bulk booking for a given range. Each element is
  an array with 3 integers: [l, r, c], where [l, r] is the range of requested slots (both inclusive), and c is the
  number of clients booked for the entire range. We can assume that 0 <= l <= r < n and c > 0.
- A positive integer, cap, representing the maximum number of interviews that can be accommodated at any given slot.

Return the number of slots that are overbooked (i.e., have more bookings than the capacity allows).

## Constraints

- 1 <= slots.length <= 10^5
- 0 <= slots[i] <= 10^5
- 0 <= bookings.length <= 10^5
- bookings[i].length is 3
- 0 <= bookings[i][0] <= bookings[i][1] < slots.length
- bookings[i][2] > 0
- 1 <= cap <= 10^6

## Example 1

### Input

slots = [0, 0, 0, 0, 0, 0]
bookings = [[0, 3, 4], [2, 5, 1], [4, 4, 3]]
cap = 5

### Output

0

The number of bookings at each slot is [4, 4, 5, 5, 4, 1].
None of them is over the cap.

## Example 1

### Input

slots = [1, 1, 0, 0, 2, 3]
bookings = [[0, 3, 4], [2, 5, 1], [4, 4, 3]]
cap = 4

### Output

5
The number of bookings at each slot is [5, 5, 5, 5, 6, 4].
