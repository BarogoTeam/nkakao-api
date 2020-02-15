package com.barogo.nkakao.entity;

public class User {
    private String userId;
    private String id;
    private String password;
    private String name;

    public User(String userId, String id, String password, String name) {
        this.userId = userId;
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
