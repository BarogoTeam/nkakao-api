package com.barogo.nkakao.entity;

import java.util.Date;

public class Token {
    private String userId;
    private String token;
    private Date createDate;
    private Date expireDate;

    public Token(String userId, String token, Date createDate, Date expireDate) {
        this.userId = userId;
        this.token = token;
        this.createDate = createDate;
        this.expireDate = expireDate;
    }
}
