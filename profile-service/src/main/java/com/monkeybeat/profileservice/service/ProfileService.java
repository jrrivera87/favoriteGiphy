package com.monkeybeat.profileservice.service;

import com.monkeybeat.profileservice.model.Profile;

import java.util.UUID;

public interface ProfileService {

    Profile getProfile(UUID uuid);

    void createProfile();


}
