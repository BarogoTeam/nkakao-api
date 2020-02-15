package com.barogo.nkakao.service;

import com.barogo.nkakao.model.Message;

import java.util.ArrayList;

/**
 * 메세지 서비스
 * @author Thesun
 * @Version 0.0.1
 */
public interface MessageService {

    Message save(Message message);

    void delete(Message message);

    Message findOne(String id);

    Iterable<Message> findAll();

    /**
     * 사용자 메세지 리스트 출력
     */
    ArrayList<Message> findByUser(String userId);
}
