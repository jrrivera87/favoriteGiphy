package com.monkeybeat.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userService")
public class UserController {

    @GetMapping("/user/{id}")
    public String retrieveUser(Long id) {

        return "test done";
    }
}
