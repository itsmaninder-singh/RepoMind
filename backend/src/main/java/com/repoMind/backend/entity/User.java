package com.repoMind.backend.entity;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
@Builder
public class User {
    private UUID id;
    private Long githubId;
    private String githubUsername;
    private String displyName;
    private String avatarUrl;
    private String Accesstoken;
    private String tokenScopes;
    private Instant createdAt;

    @PrePersist 
    void onCreate(){
        if(createdAt== null){
            createdAt=Instant.now();
        }
    }

    
    
}
