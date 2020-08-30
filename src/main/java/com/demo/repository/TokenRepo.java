package com.demo.repository;

import com.demo.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepo extends JpaRepository<TokenEntity, Integer> {
    TokenEntity findByToken(String token);
}
