package com.KyiCode.HelloWorld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name="users")
public class User {

    @Id
    private UUID id;

    private String userName;
    private String email;
    private String password;
}
