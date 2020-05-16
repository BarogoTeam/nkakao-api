package com.barogo.nkakao.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@lombok.ToString
@Document(indexName = "nkakao", type = "message")
public class Message {
    @Id
    private Integer id;
    private String roomId;
    private String userId;
    private Date date;
    private String msg;

}
