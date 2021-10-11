package com.acoder.authentication.service;

import com.acoder.authentication.dto.LoginRequest;
import com.acoder.authentication.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authentication(LoginRequest loginRequest);

    String getToken(LoginRequest loginRequest);

    ResponseEntity<?> register(SignUpRequest signUpRequest);
}
