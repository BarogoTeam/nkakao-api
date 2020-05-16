package com.barogo.nkakao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@lombok.ToString
public class Token {
    private String userId;
    private String token;
    private Date createDate;
    private Date expireDate;

}
