package com.fiko942.semester2_kegiatan1_module2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Student student = new Student();
    private static Admin admin = new Admin();
    private static ArrayList<Book> books = new ArrayList<>();

    /**
     * Initializes the list of books with predefined book entries.
     *
     */
    private static void initBook() {
        books.add(new Book(1, 1, "Wiji Fiko Teren", "Sang Pemimpi"));
        books.add(new Book(2, 2, "Wiji Fiko Teren", "Samlekommm"));
        books.add(new Book(3, 3, "Wiji Fiko Teren", "Tak bukan bukan"));
    }


    /**
     * Menu function that displays the library system menu, takes user input, and returns the chosen option.
     *
     * @return         	the user's choice as an integer
     */
    private static int Menu() {
        System.out.println("=== Library System ===");
        ArrayList<String> menus = new ArrayList<>(List.of(new String[]{
                "Login as Admin",
                "Login as Student",
                "Exit"
        }));
        menus.forEach(s -> {
            int i = menus.indexOf(s) + 1;
            System.out.printf("%d. %s\n", i, s);
        });
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose option (1-3): ");
        int choice = scanner.nextInt();
        if(choice == 3) {
            System.exit(0);
            return -1;
        } else {
            return choice;
        }
    }


    public static void main(String[] args) {
        initBook();
        while(true) {
            int mainMenuChoiced = Menu();
            System.out.println("mainMenuChoiced: " + mainMenuChoiced);
        }
    }
}