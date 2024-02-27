package com.fiko942.semester2_prak1;

import java.util.Scanner;

public class Main {

    /**
     * Print the menu options for the user to select from.
     */
    private static void printMenu() {
        String[] menus = {"Login as Student", "Login as Admin", "Exit"};
        for(int i = 0; i < menus.length; i++) {
            System.out.println((i + 1) + ". " + menus[i]);
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("===== Fiko's Library =====");
            printMenu();
            String choice = new Scanner(System.in).nextLine();
            switch(choice) {
                case "1":
                    System.out.println("Memilih 1");
                default :
                    System.out.println("Memilih default");
            }
        }
    }
}