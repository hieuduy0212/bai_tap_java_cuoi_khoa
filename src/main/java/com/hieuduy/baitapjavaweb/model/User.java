package com.hieuduy.baitapjavaweb.model;

public class User {
    private String username, password, fullname, email;
    private int id, is_admin;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(String username, String password, String fullname, String email,  int is_admin) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.is_admin = is_admin;
    }
    public User(int id, String password, String fullname, String email) {
        this.id = id;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
    }
    public User(int id, String username, String password, String fullname, String email,  int is_admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.is_admin = is_admin;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }
}
