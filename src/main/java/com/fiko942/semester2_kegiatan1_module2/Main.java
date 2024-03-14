package com.fiko942.semester2_kegiatan1_module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<Student>();

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
     * Menu function that displays the library system menu, takes user input, and
     * returns the chosen option.
     *
     * @return the user's choice as an integer
     */
    @SuppressWarnings("resource")
    private static int Menu() {
        System.out.println("=== Library System ===");
        ArrayList<String> menus = new ArrayList<>(List.of(new String[] {
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
        if (choice == 3) {
            System.exit(0);
            return -1;
        } else {
            return choice;
        }
    }

    /**
     * A method to display the admin menu options, prompt the user for a choice, and
     * handle the choice accordingly.
     *
     * @return No return value
     */
    @SuppressWarnings("resource")
    private static void menuAdmin() {
        ArrayList<String> menus = new ArrayList<>(List.of(new String[] {
                "Add Student",
                "Display Registered Students",
                "Logout"
        }));
        menus.forEach(menu -> {
            int i = menus.indexOf(menu) + 1;
            System.out.printf("%d. %s\n", i, menu);
        });
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose option (1-3): ");
        int choice = scanner.nextInt();
        if (choice == 1) { // Add students
            Admin.addStudent(students);
        } else if (choice == 2) { // Display students
            Admin.displayStudents(students);
        } else if (choice == 3) { // Logout
            return;
        }
        menuAdmin();
    }

    /**
     * adminLogin function for handling admin login process.
     *
     * @return true if the admin login is successful, false otherwise
     */
    @SuppressWarnings("resource")
    private static boolean adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (username.equals(Admin.username) && password.equals(Admin.password)) {
            return true;
        } else {
            System.out.print("Login failed are you sure to try again? (y/n): ");
            return scanner.nextLine().toLowerCase().equals("y") ? adminLogin() : false;
        }
    }

    /**
     * A method to input a NIM from the user and perform validation checks.
     *
     * @return the NIM entered by the user, or -1 if user cancels
     */
    @SuppressWarnings("resource")
    private static long inputNim() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("NIM (Enter 99 for cancel): ");
            long nim = scanner.nextLong();
            if (nim == 99)
                return -1;
            if (Long.toString(nim).length() != 15) {
                System.out.println("Invalid nim format");
                continue;
            }
            return nim;
        }
    }

    /**
     * A method that displays a menu for the student to interact with,
     * including options to view borrowed books, borrow a book, or logout.
     *
     * @param None
     * @return None
     */
    @SuppressWarnings("resource")
    private static void menuStudent() {
        ArrayList<String> menus = new ArrayList<String>(
                List.of("Borrowed Book", "Borrow a Book", "Logout"));
        menus.forEach(menu -> {
            int i = menus.indexOf(menu) + 1;
            System.out.printf("%d. %s\n", i, menu);
        });

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("List of borrowed books:");
        }

        menuStudent();
    }

    /**
     * Check if the given nim exists in the list of students.
     *
     * @param nim the nim to check
     * @return true if the nim exists, false otherwise
     */
    private static boolean checkNim(long nim) {
        return students.stream().anyMatch(s -> s.nim == nim);
    }

    public static void main(String[] args) {
        initBook();
        while (true) {
            int mainMenuChoiced = Menu();
            switch (mainMenuChoiced) {
                case 1:
                    if (adminLogin()) {
                        menuAdmin();
                    }
                    break;
                case 2:
                    long nim = inputNim();
                    if (nim > 0) {
                        if (checkNim(nim)) {
                            menuStudent();
                        } else {
                            System.out.println("NIM is not registered officially in our service");
                        }
                    }
                    break;
            }
        }
    }
}