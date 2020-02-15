package com.barogo.nkakao.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * Eleasticsearch 용 메세지 모델
 * @author Thesun
 * @version 0.0.1
 */
@Data
@Document(indexName = "nkakao", type = "message")
public class Message {

    @Id
    private String messageid;
    private String roomid;
    private String userid;
    private Date date;
    private String msg;

    //lombok constructor, getters and setters

    @Override
    public String toString(){
        return "Message{" +
                "messageid = '" + messageid + '\'' +
                ", roomid = '" + roomid + '\'' +
                ", userid = '" + userid + '\'' +
                ", date = '" + date + '\'' +
                ", msg = '" + msg + '\'' +
                '}';
    }

}
