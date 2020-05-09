package com.barogo.nkakao.entity;

import java.util.Date;

public class Message {
    private String id;
    private String roomId;
    private String userId;
    private Date date;
    private String msg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Message(String id, String roomId, String userId, Date date, String msg) {
        this.id = id;
        this.roomId = roomId;
        this.userId = userId;
        this.date = date;
        this.msg = msg;
    }
}
