package com.iviberberi.apigateway.service;

import com.iviberberi.apigateway.model.User;

public interface AuthenticationService {

    User signInAndReturnJWT(User signInRequest);
}
