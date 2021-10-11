package com.acoder.authentication.controller;

import com.acoder.authentication.dto.LoginRequest;
import com.acoder.authentication.dto.SignUpRequest;
import com.acoder.authentication.repository.UserRepository;
import com.acoder.authentication.service.AuthService;
import com.acoder.authentication.service.JwtTokenProvider;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
@Api("API Operations for Auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    @Qualifier("customUserDetailsService")
    private UserDetailsService userDetailsService;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        return authService.authentication(loginRequest);
    }

    @PostMapping("/gettoken")
    public String gettoken(@RequestBody LoginRequest loginRequest) {
        return authService.getToken(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        return authService.register(signUpRequest);
    }
}
