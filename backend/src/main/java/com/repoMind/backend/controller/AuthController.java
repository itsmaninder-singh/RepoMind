package com.repoMind.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repoMind.backend.security.AppUserPrincipal;
import com.repoMind.backend.security.CurrentUser;

import lombok.RequiredArgsConstructor;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/auth")
@RequiredArgsConstructor 
public class AuthController {
    private final CurrentUser currentUser;

    @GetMapping("/login-url")
    public Map<String, String> loginUrl(){
        return Map.of("url", "/oauth2/authorization/github");
    }

    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUser() {
        AppUserPrincipal userPrincipal = currentUser.require();
        User user = userPrincipal.getUser();
        return ResponseEntity.ok(userPrincipal);
        user.getId();
        
        
    }
    
    
    
    
}
