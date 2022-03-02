package com.iviberberi.apigateway.service;

import com.iviberberi.apigateway.model.Role;
import com.iviberberi.apigateway.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findUserByUsername(String username);

    void changeRole(Role newRole,String username);
}
