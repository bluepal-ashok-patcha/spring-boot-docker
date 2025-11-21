package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public User save(String name) {
        User u = new User();
        u.setName(name);
        return repo.save(u);
    }

    public List<User> findAll() {
        return repo.findAll();
    }
}
