package com.monkeybeat.loginservice.responseDTO;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO implements Serializable{
    private Long id;

    private String username;

    private String password;

    private String emailAddress;

    private Long profileId;

    private Character status;

    private Integer loginAttempt;

}
