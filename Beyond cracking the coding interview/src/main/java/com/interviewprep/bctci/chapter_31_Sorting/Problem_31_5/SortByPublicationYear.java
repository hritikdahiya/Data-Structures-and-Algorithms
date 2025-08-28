package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByPublicationYear {
    // Specialized sort
    // T - O(n)
    public static List<Book> sort(Book[] books) {
        // since the books can only be within 1000 - 3000
        List<Book>[] bookBuckets = new ArrayList[2001];
        Arrays.fill(bookBuckets, new ArrayList<>());

        for (Book book : books) {
            bookBuckets[book.yearPublished() - 1000].add(book);
        }

        List<Book> sortedBooks = new ArrayList<>();
        for (List<Book> bucket : bookBuckets) {
            sortedBooks.addAll(bucket);
        }

        return sortedBooks;
    }
}
