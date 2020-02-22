package com.barogo.nkakao.entity;

public class User {
    private String userId;
    private String id;
    private String password;
    private String name;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String userId, String id, String password, String name) {
        this.userId = userId;
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
