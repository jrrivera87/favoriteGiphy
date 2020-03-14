package com.monkeybeat.userservice.service.impl;

import com.monkeybeat.userservice.converter.UserConverter;
import com.monkeybeat.userservice.dto.UserDTO;
import com.monkeybeat.userservice.repository.UserRepository;
import com.monkeybeat.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserConverter userConverter;

    @Override
    public UserDTO retrieveUser(UUID id) {
        return userConverter.entityToDTO(userRepository.getOne(id));
    }

    @Override
    public void createUser(UserDTO user) {
        userRepository.save(userConverter.dtoToEntity(user));
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(UserDTO user) {
        userRepository.save(userConverter.dtoToEntity(user));
    }


}
