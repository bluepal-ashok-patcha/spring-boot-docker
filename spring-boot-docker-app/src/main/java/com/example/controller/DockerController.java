package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class DockerController {
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Dockerized Spring Boot Application!";
    }
    
    private final UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestParam(name="name") String name) {
        return userService.save(name);
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return userService.findAll();
    }
}
