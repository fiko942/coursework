package com.fiko942.semester2_kegiatan1_module2;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    /**
     * Add a new student to the memory.
     *
     * @param  memory  an ArrayList of Student objects
     * @return         void
     */
    public static void addStudent(ArrayList<Student> memory) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("NIM: ");
        long nim = scanner.nextLong();

        // Validate nim
        while(Long.toString(nim).length() != 15) {
            System.out.println("Invalid NIM!!!");
            System.out.print("NIM: ");
            nim = scanner.nextLong();
        }

        System.out.print("Program: ");
        scanner = new Scanner(System.in);
        String program = scanner.nextLine();

        Student student = new Student();
        student.name = name;
        student.nim = nim;
        student.programStudy = program;
        student.faculty = faculty;

        memory.add(student);

        System.out.println("Student has been added successfully!");
    }
}
