package com.monkeybeat.userservice.controller;

import com.monkeybeat.userservice.dto.UserDTO;
import com.monkeybeat.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/userService")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserDTO retrieveUser(UUID id) {
        return userService.retrieveUser(id);
    }

    @PostMapping("/user")
    public void createUser(UserDTO user){
        userService.createUser(user);
    }

    @PutMapping("/user")
    public void updateUser(UserDTO user){
        userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(UUID id){
        userService.deleteUser(id);
    }

//    TODO need to finish validating once DB connection is set up to validate service.
}
