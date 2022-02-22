package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @Size(min = 5, max = 15, message = "Don't leave blank")
    @NotBlank(message = "Field required")
    private String username;

    @Email(message = "must be valid email")
    private String email;

    @NotBlank(message = "Field required")
    @Size(min = 6, max = 20, message = "Don't leave blank")
    private String password;

    private String verifyPassword;

    public User() {};

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    private void checkPassword() {
        if(password.equals(verifyPassword)) {

        } else {

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
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
