package com.fiko942.codelab1_module2;

public class Mahasiswa {
    String name;
    long nim;
    String jurusan;

    /**
     * A description of the entire Java function.
     *
     */
    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    /**
     * A method to display the information of a student.
     *
     */
    public void tampilDataMahasiswa() {
        System.out.printf("Nama: %s | NIM: %d | Jurusan: %s\n", this.name, this.nim, this.jurusan);
    }
}
