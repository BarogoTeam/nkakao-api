package com.barogo.nkakao.entity;

import springfox.documentation.spring.web.json.Json;

import java.util.List;

public class Room {
    private String id;
    private List<String> users;
    private String lastChatId;
    private Json info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public String getLastChatId() {
        return lastChatId;
    }

    public void setLastChatId(String lastChatId) {
        this.lastChatId = lastChatId;
    }

    public Json getInfo() {
        return info;
    }

    public void setInfo(Json info) {
        this.info = info;
    }

    public Room(String id, List<String> users, String lastChatId, Json info) {
        this.id = id;
        this.users = users;
        this.lastChatId = lastChatId;
        this.info = info;
    }

    public Room(String id, List<String> users) {
        this.id = id;
        this.users = users;
        this.lastChatId = null;
        this.info = null;
    }
}
