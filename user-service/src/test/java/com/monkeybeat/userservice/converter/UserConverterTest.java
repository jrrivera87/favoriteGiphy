package com.monkeybeat.userservice.converter;

import com.monkeybeat.userservice.dto.UserDTO;
import com.monkeybeat.userservice.model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserConverterTest {
    UserConverter userConverter = new UserConverter();
    UUID uuid = UUID.randomUUID();
    UUID profileUUID = UUID.randomUUID();
    List<String> roles = new ArrayList<String>();
    User user = new User("usernameTest", "First Last", "password", "user@test.com");
    UserDTO userDTO = new UserDTO(uuid, "usernameTest", "First Last", "password",
            "user@test.com", profileUUID, 'y', 0, roles);

    @Test
    void convertEntityToDTO() {
        UserDTO testUser = userConverter.entityToDTO(user);
        assertTrue(testUser.getUsername() == user.getUsername());
        assertTrue(testUser.getFullName() == user.getFullName());
        assertTrue(testUser.getPassword() == user.getPassword());
        assertTrue(testUser.getEmailAddress() == user.getEmailAddress());
    }

    @Test
    void convertDtoToExisting() {
        User testUser = userConverter.dtoToExisting(userDTO);
        assertTrue(testUser.getUsername() == userDTO.getUsername());
        assertTrue(testUser.getFullName() == userDTO.getFullName());
        assertTrue(testUser.getPassword() == userDTO.getPassword());
        assertTrue(testUser.getEmailAddress() == userDTO.getEmailAddress());
    }

    @Test
    void convertDtoToEntity() {
        User testUser = userConverter.dtoToEntity(userDTO);
        assertTrue(testUser.getUsername() == userDTO.getUsername());
        assertTrue(testUser.getFullName() == userDTO.getFullName());
        assertTrue(testUser.getPassword() == userDTO.getPassword());
        assertTrue(testUser.getEmailAddress() == userDTO.getEmailAddress());
    }
}
