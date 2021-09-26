package me.ghostfenrir.dataobject;

import me.ghostfenrir.encapsulation.User;

public class UserDAO {
    public static void setUserProfile(User user) {
        getUserProfile(user);
    }

    private static void getUserProfile(User user) {
//        if (user.getUsername().equals("Admin") && user.getPassword().equals("Root")) System.out.println("Administrative Access Granted");
//        else System.out.println("Normal Access Granted");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
    }
}
