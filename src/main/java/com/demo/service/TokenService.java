package com.demo.service;

import com.demo.entity.TokenEntity;
import com.demo.entity.UserEntity;

public interface TokenService {
    UserEntity findUserByToken(String token);
    TokenEntity createToken(int userID);
}
