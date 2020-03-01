package com.monkeybeat.loginservice.service;

import com.monkeybeat.loginservice.RequestDTO.LoginRequestDTO;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {

    String login(LoginRequestDTO requestDTO, HttpServletRequest request);

}
