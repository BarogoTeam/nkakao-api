package com.barogo.nkakao.repository;

import com.barogo.nkakao.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends MongoRepository<Message, String> {

    @Query("{'id': ?0 }")
    Optional<Message> findById(String id);

    @Query("{'roomId': ?0 }")
    List<Message> findByRoomId(String roomId);
}
