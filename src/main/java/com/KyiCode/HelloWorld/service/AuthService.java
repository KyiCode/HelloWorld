package com.KyiCode.HelloWorld.service;


import com.KyiCode.HelloWorld.dto.request.RegisterReqDto;
import com.KyiCode.HelloWorld.entity.User;
import com.KyiCode.HelloWorld.repository.AuthRepository;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public ResponseEntity<Void> createUser(RegisterReqDto registerReqDto) {
        User userEntity = new User();
        userEntity.setUserName(registerReqDto.getUserName());
        userEntity.setEmail(registerReqDto.getEmail());
        userEntity.setPassword(registerReqDto.getPassword());


    }

}
