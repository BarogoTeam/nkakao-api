package com.barogo.nkakao.service;


import com.barogo.nkakao.entity.User;
import com.barogo.nkakao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void insert(User user) {
        userRepository.insert(user);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
}
