package com.example.splitwise.controller;

import com.example.splitwise.model.User;
import com.example.splitwise.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService = new UserService();

    @PostMapping
    public User createUser (@RequestBody User user) {
        return userService.addUser (user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}