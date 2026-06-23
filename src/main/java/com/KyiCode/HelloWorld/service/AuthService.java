package com.KyiCode.HelloWorld.service;


import com.KyiCode.HelloWorld.repository.AuthRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public

}
