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

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable String id) {
        return messageService.findById(id);
    }

    @GetMapping()
    public Iterable<Message> getMessageList() {
        return messageService.findAll();
    }

    @GetMapping("/room/{roomId}")
    public List<Message> getRoomMessageList(@PathVariable String roomId) {
        return messageService.findByRoomId(roomId);
    }

    @GetMapping("/room/{roomId}/update/{id}")
    public List<Message> getRoomMessageList(@PathVariable String roomId,@PathVariable String id) {
        return messageService.updateRoomById(roomId,id);
    }

    @PostMapping()
    public void addMessage(@RequestBody Message message) {
        messageService.insert(message);
    }

}
