package com.repoMind.backend.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repoMind.backend.entity.User;
import java.util.List;


public interface UserRepo extends JpaRepository<User,UUID>{
    Optional<User> findByGithubId(Long githubId);
    
}
