package com.monkeybeat.userservice.converter;

import com.monkeybeat.userservice.dto.UserDTO;
import com.monkeybeat.userservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {
    public UserDTO entityToDTO(User user){
        UserDTO userDTO = new UserDTO(user.getId(), user.getUsername(), user.getFullName(), user.getPassword(),
                user.getEmailAddress(), user.getProfileId(), user.getStatus(), user.getLoginAttempt(), user.getRoles());
        return userDTO;
    }

    public User dtoToExisting(UserDTO userDTO){
        User user = new User(userDTO.getUsername(), userDTO.getFullName(), userDTO.getPassword(), userDTO.getEmailAddress());
        user.setId(userDTO.getId());
        user.setProfileId(userDTO.getProfileId());
        user.setStatus(userDTO.getStatus());
        user.setLoginAttempt(userDTO.getLoginAttempt());
        user.setRoles(userDTO.getRoles());
        return user;
    }

    public User dtoToEntity(UserDTO userDTO){
        User user = new User(userDTO.getUsername(), userDTO.getFullName(), userDTO.getPassword(), userDTO.getEmailAddress());
        user.setId(userDTO.getId());
        user.setProfileId(userDTO.getProfileId());
        user.setStatus(userDTO.getStatus());
        user.setLoginAttempt(userDTO.getLoginAttempt());
        user.setRoles(userDTO.getRoles());
        return user;
    }
}
