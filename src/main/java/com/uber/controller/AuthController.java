package com.uber.controller;

import com.uber.dto.SignupDto;
import com.uber.dto.UserDto;
import com.uber.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto signUp(@RequestBody SignupDto signupDto){
        return authService.signup(signupDto);
    }
}
