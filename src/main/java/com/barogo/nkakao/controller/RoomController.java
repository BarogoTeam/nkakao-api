package com.barogo.nkakao.controller;

import com.barogo.nkakao.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping()
    public String createRoom(@RequestBody Map<String, List<String>> json) {
        return roomService.createRoom(json);
    }
 }
