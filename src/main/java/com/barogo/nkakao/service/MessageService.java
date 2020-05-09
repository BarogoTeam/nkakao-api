package com.barogo.nkakao.service;


import com.barogo.nkakao.entity.Message;
import com.barogo.nkakao.entity.User;
import com.barogo.nkakao.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    public void insert(Message message) {
        messageRepository.insert(message);
    }

    public void deleteById(String id) {
        messageRepository.deleteById(id);
    }
}
