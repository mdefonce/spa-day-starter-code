package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Username must not be blank.")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters long.")
    private String username;

    @Email(message = "Invalid email. Try again.")
    private String email;

    @NotBlank(message = "Password must not be blank.")
    @Min(6)
    private String password;

    @NotBlank(message = "Passwords must match.")
    private String verify;

    @NotNull(message = "Passwords do not match.")
    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    private void checkPassword() {
        if (!password.equals(verifyPassword) && password != null && verifyPassword != null) {
            verifyPassword = null;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }
}
