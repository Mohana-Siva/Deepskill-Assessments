package com.cognizant.authlearn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthController {

    // Secret key (must be at least 32 bytes for HS256)
    private static final SecretKey SECRET_KEY =
            Keys.hmacShaKeyFor("mysecretkeymysecretkeymysecretkey12".getBytes());

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }

    private String getUser(String authHeader) {

        String encodedCredentials = authHeader.substring(6);

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials = new String(decodedBytes);

        return credentials.split(":")[0];
    }

    private String generateJwt(String user) {

        return Jwts.builder()
                .subject(user)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(SECRET_KEY)
                .compact();
    }
}