package com.barogo.nkakao.entity;

import springfox.documentation.spring.web.json.Json;

import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<String> users;
    private String lastChatId;
    private Json info;

    public ChatRoom(String roomId, List<String> users, String lastChatId, Json info) {
        this.roomId = roomId;
        this.users = users;
        this.lastChatId = lastChatId;
        this.info = info;
    }
}
