package com.demo.service;

import com.demo.dto.UserDto;
import com.demo.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity login(String username, String password);
    UserEntity findUserByUsername(String username);
    UserEntity saveUser(UserEntity userEntity);
    List<UserEntity> getAll();
}
