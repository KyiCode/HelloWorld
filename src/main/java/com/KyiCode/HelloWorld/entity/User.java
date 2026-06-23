package com.KyiCode.HelloWorld.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    private UUID id;
    @Setter
    private String userName;
    @Setter
    private String email;
    @Setter
    private String password;
}
