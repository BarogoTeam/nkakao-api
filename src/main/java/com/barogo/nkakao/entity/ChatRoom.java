package com.barogo.nkakao.entity;

import springfox.documentation.spring.web.json.Json;

import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<String> users;
    private String lastChatId;
    private Json info;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
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

    public ChatRoom(String roomId, List<String> users, String lastChatId, Json info) {
        this.roomId = roomId;
        this.users = users;
        this.lastChatId = lastChatId;
        this.info = info;
    }
}
