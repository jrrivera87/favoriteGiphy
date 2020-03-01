package com.monkeybeat.loginservice.RequestDTO;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDTO implements Serializable{
    private String username;

    private String emailAddress;
}
