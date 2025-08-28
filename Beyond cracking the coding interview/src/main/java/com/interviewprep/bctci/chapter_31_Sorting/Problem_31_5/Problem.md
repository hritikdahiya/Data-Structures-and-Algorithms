# SORT BY PUBLICATION YEAR

## Problem statement

You are given an array, books, of objects of a Book class, where each book has fields title, author, page_count, genre,
and year_published.

Return the books sorted by publication year. It doesn't matter how you break ties.

## Constraints

- The length of books is at most 10^5
- All years are between 1000 and 3000

## Example 1

### Input

books = [
Book("Shadow of Tomorrow", "Elliot Greyson", 350, "Science Fiction", 2020),
Book("Whispers in the Wind", "Lila Hart", 280, "Romance", 2018),
Book("Echoes of Eternity", "Mara Vance", 420, "Fantasy", 2018),
Book("Fragments of Dawn", "Cora Blake", 310, "Mystery", 2019),
Book("Beneath the Starlit Sky", "Aria Monroe", 270, "Drama", 2020)
]

### Output

[
Book("Echoes of Eternity", "Mara Vance", 420, "Fantasy", 2018),
Book("Whispers in the Wind", "Lila Hart", 280, "Romance", 2018),
Book("Fragments of Dawn", "Cora Blake", 310, "Mystery", 2019),
Book("Beneath the Starlit Sky", "Aria Monroe", 270, "Drama", 2020),
Book("Shadow of Tomorrow", "Elliot Greyson", 350, "Science Fiction", 2020)
]

## Example 2

### Input

[]

### Output

[].

Empty list is valid input.

## Example 3

### Input

[Book("Solo", "Author", 100, "Genre", 2000)]

### Output

[Book("Solo", "Author", 100, "Genre", 2000)].

Single book is already
sorted.