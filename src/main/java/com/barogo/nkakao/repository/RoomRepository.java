package com.barogo.nkakao.repository;

import com.barogo.nkakao.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends MongoRepository<Room, String> {

    @Query("{'id': ?0 }")
    Optional<Room> findById(String id);

    @Query("{'userId': ?0 }")
    List<Room> findByUserId(String userId);
}
