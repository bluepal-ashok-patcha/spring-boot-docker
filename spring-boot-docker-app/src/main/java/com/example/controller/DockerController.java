package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Dockerized Spring Boot Application!";
    }
}
