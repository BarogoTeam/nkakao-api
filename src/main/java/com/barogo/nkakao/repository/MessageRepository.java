package com.barogo.nkakao.repository;

import com.barogo.nkakao.entity.Message;
import com.barogo.nkakao.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MessageRepository extends MongoRepository<Message, String> {
    Optional<Message> findById(String id);
}
