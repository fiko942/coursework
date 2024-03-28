package com.fiko942.semester2_kegiatan1_module2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String faculty;
    String programStudy;
    long nim;

    public Student(String name, long nim, String faculty, String programStudy) {
        this.name = name;
        this.faculty = faculty;
        this.nim = nim;
        this.programStudy = programStudy;
    }

    // Books borrowed
    private static ArrayList<Book> books = new ArrayList<Book>();

    public static boolean logout() {
        if (books.size() == 0) {
            return true;
        }
        // Listen to confirm
        System.out.print("Apakah anda ingin membatalkan pinjaman (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.toLowerCase() == "y") {
            books.clear();
        }
        scanner.close();
        return true;
    }

    /**
     * Displays the list of borrowed books.
     *
     * @param None
     * @return None
     */
    public static void showBorrowedBooks() {
        if (books.size() == 0) {
            System.out.println("No books borrowed yet!");
            return;
        }
        books.forEach(book -> {
            System.out.printf("%d | %s | %s\n", book.id, book.title, book.author);
        });
    }

    /**
     * Displays the information of the object.
     *
     * @param None No parameters needed.
     * @return None No return value.
     */
    public void displayInfo() {
        System.out.printf("%s | %d | %s | %s\n", name, nim, programStudy, faculty);
    }

    public void displayBooks() {
        System.out.println();
    }

    /**
     * Display the list of borrowed books with their id, title, and author.
     */
    public static void displayBorrowedBooks() {
        books.forEach(book -> {
            System.out.printf("%d | %s | %s | %d Hari\n", book.id, book.title, book.author, book.borrowedForDays);
        });
    }

    /**
     * Returns the index of the book with the given ID in the books list.
     *
     * @param id the ID of the book to search for
     * @return the index of the book if found, -1 otherwise
     */
    private static int getBookIndex(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the ID of a book that has been returned by the user.
     *
     * @return the ID of the book that has been returned
     */
    public static int returnBook() {
        displayBorrowedBooks();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan id buku untuk dikembalikan: ");
        int idBook = scanner.nextInt();
        int i = getBookIndex(idBook);
        if (i >= 0) {
            books.remove(i);
            System.out.println("Buku dikembalikan!");
        }
        System.err.println("Daftar buku yang anda pinjam: ");
        displayBorrowedBooks();
        return idBook;
    }

    /**
     * A description of the entire Java function.
     *
     * @param _book description of parameter
     */
    public static int addBorrowedBooks(Book _book) {
        System.out.print("Berapa hari anda ingin meminjam buku? (number): ");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        if (!books.stream().anyMatch(book -> book.id == _book.id)) {
            _book.borrowedForDays = days;
            books.add(_book);
        }
        return _book.id;
    }
}
