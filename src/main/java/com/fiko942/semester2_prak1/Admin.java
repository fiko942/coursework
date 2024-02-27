package com.fiko942.semester2_prak1;

import java.util.ArrayList;
import java.util.List;

class AdminDetail {
    public String username;
    public String password;
}

public class Admin {

    private static List<AdminDetail> admins = new ArrayList<AdminDetail>();// Expect this as a admins database on memory

    /**
     * A method to initialize the admin.
     *
     * @param  None
     */
    public void init() {
        System.out.println("Admin constructor() called");
        // Add single admin
        AdminDetail admin = new AdminDetail();
        admin.username = "admin";
        admin.password = "admin";
        admins.add(admin);
    }

    /**
     * A method to attempt to log in with the given username and password.
     *
     * @param  username    the username to log in with
     * @param  password    the password to log in with
     * @return             true if the login is successful, false otherwise
     */
    public boolean login(String username, String password) {
/*        AdminDetail target2Find = new AdminDetail();
        target2Find.username = username;
        target2Find.password = password;
        return admins.contains(target2Find);*/

        for (AdminDetail admin : admins) {
            if (admin.username.equals(username) && admin.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
