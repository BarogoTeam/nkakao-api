package com.barogo.nkakao.controller;

import com.barogo.nkakao.entity.User;
import com.barogo.nkakao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/add")
    public void addUser() {
        User user = new User("ANY_USER_ID", "ANY_ID", "ANY_PASSWORD", "ANY_NAME");
        userRepository.insert(user);
    }
}
