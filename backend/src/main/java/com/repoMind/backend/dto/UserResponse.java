package com.repoMind.backend.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor 
@Getter 
@Setter 
@AllArgsConstructor 
public class UserResponse {
   
    public UserResponse(UUID id2, Long githubId2, String githubUsername2, String displayName2, String avatarUrl2) {
        //TODO Auto-generated constructor stub
    }
    Long id;
    String githubId;
    String githubUsername;
    String displayName;
    String avatarUrl;

    
}
