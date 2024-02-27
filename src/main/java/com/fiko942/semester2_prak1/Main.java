package com.fiko942.semester2_prak1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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


    /**
     * The main function for the Fiko's Library program.
     *
     * @param  args	command line arguments
     * @throws IOException
     * @throws InterruptedException
     */
    public static <List> void main(String[] args) throws IOException, InterruptedException {
        Student student = new Student();
        Admin admin = new Admin();
        admin.init();

        while(true) {
            System.out.println("===== Fiko's Library =====");
            printMenu();
            String choice = new Scanner(System.in).nextLine();
            switch(choice) {
                case "1": // Login as student condition
                    System.out.print("Enter your NIM: ");
                    String nim = new Scanner(System.in).nextLine();
                    boolean studentAuthenticated = student.login(nim);
                    System.out.println(studentAuthenticated ? "Successfull login as a Student!" : "Nim isn't registered!");
                    break;
                case "2" : // Login as a admin
                    System.out.print("Enter your username: ");
                    String username = new Scanner(System.in).nextLine();
                    System.out.print("Enter your password: ");
                    String password = new Scanner(System.in).nextLine();
                    boolean adminAuthenticated = admin.login(username, password);
                    System.out.println(adminAuthenticated ? "Successfull login as a admin!" : "Admin user not found!");
                    break;
                case "3" :
                    System.exit(0);
            }

            ArrayList<String> breakedChoices = new ArrayList<String>(Arrays.asList("1", "2"));
            if (breakedChoices.contains(choice)) {
                System.out.println("Press any key to continue ...");
                new Scanner(System.in).nextLine();
            }
        }
    }
}