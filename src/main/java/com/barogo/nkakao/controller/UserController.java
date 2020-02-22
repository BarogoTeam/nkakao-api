package com.barogo.nkakao.controller;

import com.barogo.nkakao.entity.User;
import com.barogo.nkakao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userService.findById(id);
    }

    @RequestMapping()
    public List<User> getUserList() {
        return userService.findAll();
    }

    @PostMapping()
    public void addUser() {
        User user = new User("ANY_USER_ID", "ANY_ID", "ANY_PASSWORD", "ANY_NAME");
        userService.insert(user);
    }
}
