package com.acoder.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    @Qualifier("customUserDetailsService")
    private UserDetailsService userDetailsService;
}
