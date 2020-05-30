package com.barogo.nkakao.service;


import com.barogo.nkakao.entity.Message;
import com.barogo.nkakao.entity.User;
import com.barogo.nkakao.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Optional<Message> findById(String id) {
        return messageRepository.findById(id);
    }

    public Iterable<Message> findAll() {
        return messageRepository.findAll();
    }

    public List<Message> findByRoomId(String roomId) {
        return messageRepository.findByRoomId(roomId);
    }

    public List<Message> updateRoomById(String roomId, String id) {
        return messageRepository.updateRoomById(roomId, id);
    }

    public void insert(Message message) {
        Date d = new Date();
        message.setId((int)d.getTime());
        messageRepository.save(message);
    }

}
