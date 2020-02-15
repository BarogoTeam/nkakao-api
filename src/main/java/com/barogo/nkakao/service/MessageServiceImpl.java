package com.barogo.nkakao.service;

import com.barogo.nkakao.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MessageServiceImpl implements MessageService{

    @Override
    public Message save(Message message) {
        return null;
    }

    @Override
    public void delete(Message message) {

    }

    @Override
    public Message findOne(String id) {
        return null;
    }

    @Override
    public Iterable<Message> findAll() {
        return null;
    }

    @Override
    public ArrayList<Message> findByUser(String userId){
        return null;
    }
}
