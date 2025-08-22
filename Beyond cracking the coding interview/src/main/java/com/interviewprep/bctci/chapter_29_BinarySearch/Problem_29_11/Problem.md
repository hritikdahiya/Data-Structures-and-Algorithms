# MIN PAGES PER DAY

## Problem statement

You have upcoming interviews and have selected specific chapters from BCtCI to read beforehand. Given an array,
page_counts, where each element represents a chapter's page count, and the number of days, days, until your interview,
determine the minimum number of pages you must read daily to finish on time. Assume that:

You must read all the pages of a chapter before moving on to another one.
If you finish a chapter on a given day, you practice for the rest of the day and don't start the next chapter until the
next day.

len(page_counts) <= days.

## Constraints

- 1 <= len(page_counts) <= days <= 10^6
- 1 <= page_counts[i] <= 10^4

## Example 1

### Input

page_counts = [20, 15, 17, 10]
days = 14

### Output

5

We can read 5 pages daily and finish all chapters. At a maximum of
5 pages per day, we spend:

- 4 days on the first chapter.
- 3 days on the second chapter.
- 4 days on the third chapter (stopping when we finish early).
- 2 days on the fourth chapter.
  In total, we spent 13 days reading 5 pages a day, which is the lowest amount
  we can read daily and still finish on time.

## Example 2

### Input

page_counts = [20, 15, 17, 10]
days = 5

### Output

17