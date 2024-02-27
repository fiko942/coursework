package com.fiko942.semester2_prak1;

public class Student {

    /**
     * A function to perform a login action.
     *
     * @param  nim  the NIM (Nomor Induk Mahasiswa) provided for login
     * @return      true if the length of the trimmed NIM is 15, false otherwise true means login success but false is nim is not registered
     */
    public boolean login(String nim) {
        return nim.trim().length() == 15;
    }
}
