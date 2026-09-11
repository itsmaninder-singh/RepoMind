package com.repoMind.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity 
@Table (name="repositories",
 uniqueConstraints = @UniqueConstraint(columnNames = {"name", "owner"}))
public class Repository {
    
}
