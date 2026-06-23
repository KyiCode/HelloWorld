package com.KyiCode.HelloWorld.controller;


import com.KyiCode.HelloWorld.dto.request.RegisterReqDto;
import com.KyiCode.HelloWorld.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterReqDto registerReqDto) {
        authService.createUser(registerReqDto);
    }

//    @PostMapping

}
