package com.barogo.nkakao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@lombok.ToString
public class Room {
    private String id;
    private List<String> users;
    private String lastChatId;
    private Json info;


    public Room(String id, List<String> users) {
        this.id = id;
        this.users = users;
        this.lastChatId = null;
        this.info = null;
    }
}
