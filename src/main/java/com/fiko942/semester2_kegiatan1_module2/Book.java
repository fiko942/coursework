package com.fiko942.semester2_kegiatan1_module2;

public class Book {
    int id;
    int stock;
    String author;
    String title;
    public int borrowedForDays;
    String category;

    // Constructor
    public Book(int id, int stock, String author, String title, int borrowedForDays, String category) {
        this.id = id;
        this.stock = stock;
        this.author = author;
        this.title = title;
        this.borrowedForDays = borrowedForDays;
        this.category = category;
    }

}
