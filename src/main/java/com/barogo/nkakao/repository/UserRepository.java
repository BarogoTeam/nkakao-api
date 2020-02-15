package com.barogo.nkakao.repository;

import com.barogo.nkakao.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);
    public User insert(User user);
}
