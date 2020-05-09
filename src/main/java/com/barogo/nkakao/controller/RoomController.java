package com.barogo.nkakao.controller;

import com.barogo.nkakao.entity.Room;
import com.barogo.nkakao.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @GetMapping("/user/{userId}")
    public List<Room> getUserRoomList(@PathVariable String userId) {
        return roomService.findByUserId(userId);
    }

}
