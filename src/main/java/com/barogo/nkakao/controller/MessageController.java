package com.barogo.nkakao.controller;

import com.barogo.nkakao.entity.Message;
import com.barogo.nkakao.entity.User;
import com.barogo.nkakao.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/message")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable String id) {
        return messageService.findById(id);
    }

    @RequestMapping()
    public List<Message> getMessageList() {
        return messageService.findAll();
    }

    @PostMapping()
    public void addMessage(@RequestBody Message message) {
        messageService.insert(message);
    }

    @DeleteMapping("/{id}")
    public void removeMessage(@PathVariable String id) {
        messageService.deleteById(id);
    }
}
