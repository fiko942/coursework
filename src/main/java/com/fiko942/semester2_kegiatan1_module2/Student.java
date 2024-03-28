package com.fiko942.semester2_kegiatan1_module2;

import java.util.ArrayList;

public class Student {
    String name;
    String faculty;
    String programStudy;
    long nim;

    private static ArrayList<Book> books = new ArrayList<Book>();

    public static void logout() {

    }

    public void displayBooks() {
        System.out.println();
    }

    /**
     * Display the list of borrowed books with their id, title, and author.
     */
    public void displayBorrowedBooks() {
        books.forEach(book -> {
            System.out.printf("%d | %s | %s\n", book.id, book.title, book.author);
        });
    }

    /**
     * A description of the entire Java function.
     *
     * @param _book description of parameter
     */
    public static void addBorrowedBooks(Book _book) {
        if (!books.stream().anyMatch(book -> book.id == _book.id)) {
            books.add(_book);
        }
    }
}
