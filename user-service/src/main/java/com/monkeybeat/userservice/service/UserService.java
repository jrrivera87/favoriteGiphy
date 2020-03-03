package com.monkeybeat.userservice.service;

import com.monkeybeat.userservice.dto.UserDTO;

import java.util.UUID;

public interface UserService {

    UserDTO retrieveUser(UUID id);

    void createUser(UserDTO user);

    void deleteUser(UUID id);

    void updateUser(UserDTO user);
}
