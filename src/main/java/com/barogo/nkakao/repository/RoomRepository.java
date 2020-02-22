package com.barogo.nkakao.repository;

import com.barogo.nkakao.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoomRepository extends MongoRepository<Room, String> {
    Optional<Room> findById(String id);
}
