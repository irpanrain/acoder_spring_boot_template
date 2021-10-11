package com.acoder.authentication.dto;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

@Data
public class JwtAuthenticationResponse {

    private String accessToken;
    private String tokenType = "Bearer";
    private UserDetails user;
    private String username;

    public JwtAuthenticationResponse(String accessToken, String username, UserDetails user) {
        this.accessToken = accessToken;
        this.username = username;
        this.user = user;
    }

    public JwtAuthenticationResponse(String accessToken, String username) {
        this.accessToken = accessToken;
        this.username = username;
    }

}
