package com.codewithmosh.store.controller;

import org.springframework.web.bind.annotation.*;
import lombok.*;

import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.UserRepository;
import com.codewithmosh.store.entities.Error;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class UserController {
    private  UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
   
    @GetMapping("/user")
    public ResponseEntity<Iterable<User>> getAllUsers() {
        System.out.println("Getting all users");
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        System.out.println("User: " + user);
        if (user == null) {
            return ResponseEntity.status(404).body(new Error("User not found", "404"));
        }
        return ResponseEntity.ok(user);
    }

  
}
