package com.barogo.nkakao.entity;

import java.util.Date;

public class Message {
    private String messageId;
    private String roomId;
    private String userId;
    private Date date;
    private String msg;

    public Message(String messageId, String roomId, String userId, Date date, String msg) {
        this.messageId = messageId;
        this.roomId = roomId;
        this.userId = userId;
        this.date = date;
        this.msg = msg;
    }
}
