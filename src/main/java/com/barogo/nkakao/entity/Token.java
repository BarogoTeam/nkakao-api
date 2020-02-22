package com.barogo.nkakao.entity;

import java.util.Date;

public class Token {
    private String userId;
    private String token;
    private Date createDate;
    private Date expireDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Token(String userId, String token, Date createDate, Date expireDate) {
        this.userId = userId;
        this.token = token;
        this.createDate = createDate;
        this.expireDate = expireDate;
    }
}
