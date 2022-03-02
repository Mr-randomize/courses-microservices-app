package com.iviberberi.apigateway.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "passwor",  nullable = false)
    private String password;

    @Column(name = "name",  nullable = false)
    private String name;

    @Column(name = "create_time",  nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private Role role;
}