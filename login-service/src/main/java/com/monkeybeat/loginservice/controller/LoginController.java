package com.monkeybeat.loginservice.controller;

import com.monkeybeat.loginservice.RequestDTO.LoginRequestDTO;
import com.monkeybeat.loginservice.constants.WebResourceKeyConstants;
import com.monkeybeat.loginservice.service.LoginService;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/loginServer")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    // TODO need to finish flushing out the login services. The Service will be used to validate the login and pass a security Token.
    @GetMapping("/test")
    public String test() {
        return "test done";
    }

}
