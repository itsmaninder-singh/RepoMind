package com.repoMind.backend.services;

import java.util.UUID;

import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.repoMind.backend.entity.User;
import com.repoMind.backend.repo.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    public final UserRepo userRepo;
    public final TextEncryptor textEncryptor;
    



    @Transactional(readOnly=true)
    public User requiredById(UUID id){
        return userRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("user not found")); 
        
    }
    public String decryptAccessToken(User user){
        return textEncryptor.decrypt(user.getAccessToken());
    }
    private static Long toLong(Object value){
        if(value instanceof Number number){
            return number.longValue();
        }
        return Long.parseLong(String.valueOf(value));
    }

    
}
