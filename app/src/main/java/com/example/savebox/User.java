package com.example.savebox;

public class User {



    public User(String username, String email, String phone, String type) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.type = type;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String username;
    private String email;
    private String phone;
    private String type;

    public User() {
        this.username = "";
        this.email = "";
        this.phone = "";
        this.type = "";


    }
}
