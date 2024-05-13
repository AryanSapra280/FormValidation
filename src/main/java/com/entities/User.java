package com.entities;


import jakarta.validation.constraints.*;

public class User {
    
    @NotBlank(message = "User Name can not be empty")
    @Size(min = 3, max = 12, message = "User Name should be between 3 to 12!")
    private String userName;

    private String email;
    
    public User() {
    }
    
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", email=" + email + "]";
    }
    
}
