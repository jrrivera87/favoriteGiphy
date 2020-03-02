package com.monkeybeat.userservice.service;

import com.monkeybeat.userservice.model.User;

import java.util.UUID;

public interface UserService {

    User retrieveUser(UUID id);

    void createUser(User user);

    void deleteUser(long id);
}
