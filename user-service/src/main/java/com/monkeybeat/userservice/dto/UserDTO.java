package com.monkeybeat.userservice.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserDTO {
    private UUID id;

    private String username;

    private String fullName;

    private String password;

    private String emailAddress;

    private UUID profileId;

    private Character status;

    private Integer loginAttempt;

    private List<String> roles = new ArrayList<>();

    public UserDTO() {}

    public UserDTO(UUID id, String username, String fullName, String password,
                   String emailAddress, UUID profileId, Character status, Integer loginAttempt, List<String> roles) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.profileId = profileId;
        this.status = status;
        this.loginAttempt = loginAttempt;
        this.roles = roles;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public void setProfileId(UUID profileId) {
        this.profileId = profileId;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Integer getLoginAttempt() {
        return loginAttempt;
    }

    public void setLoginAttempt(Integer loginAttempt) {
        this.loginAttempt = loginAttempt;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
