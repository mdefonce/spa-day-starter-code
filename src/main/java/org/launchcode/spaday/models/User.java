package org.launchcode.spaday.models;

public class User {

    private static String username;
    private static String email;
    private static String password;

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        User.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        User.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        User.password = password;
    }
}
