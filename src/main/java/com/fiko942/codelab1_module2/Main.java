package com.fiko942.codelab1_module2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    /**
     * Adds a new Mahasiswa to the list after taking input for name, NIM, and jurusan.
     *
     * @return         	None
     */
    private static void addMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String name = scanner.nextLine();
        long nim = 0;
        System.out.print("Masukkan NIM mahasiswa: ");
        nim = scanner.nextLong();
        while(Long.toString(nim).length() != 15) {
            System.out.println("Nim harus 15 Digit!!!");
            System.out.print("Masukkan NIM mahasiswa: ");
            nim = scanner.nextLong();
        }
        System.out.print("Masukkan jurusan mahasiswa: ");
        scanner = new Scanner(System.in);
        String jurusan = scanner.nextLine();

        Mahasiswa mhs = new Mahasiswa();
        mhs.name = name;
        mhs.jurusan = jurusan;
        mhs.nim = nim;

        listMahasiswa.add(mhs);

        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    private static void tampilDataMahasiswa() {
        System.out.println("Data mahasiswa:");
        System.out.println("Universitas Muhammadiyah Malang");
        listMahasiswa.forEach(Mahasiswa::tampilDataMahasiswa);
    }


    /**
     * Displays the menu options, takes user input, and performs the corresponding action.
     *
     * @return None
     */
    private static void menu() {
        System.out.println("Menu:");
        List<String> menus = List.of("Tambah Data Mahasiswa", "Tampilkan Data Mahasiswa", "Keluar");
        menus.forEach(menu -> {
            int no = menus.indexOf(menu) + 1;
            System.out.printf("%d. %s\n", no, menu);
        });
        System.out.print("Pilihan Anda: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice) {
            case 1 :
                addMahasiswa();
                break;
            case 2 :
                tampilDataMahasiswa();
                break;
            case 3 :
                System.exit(0);
        }
    }
}