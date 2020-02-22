package com.barogo.nkakao.service;

import com.barogo.nkakao.entity.Room;
import com.barogo.nkakao.repository.RoomRepository;
import com.barogo.nkakao.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoomService {
    private  final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public String createRoom(Map<String, List<String>> json) {
        String id = new IdGenerator().getId();
        Room room = new Room(id, json.get("userIdList"));
        roomRepository.insert(room);
        return id;
    }
}
