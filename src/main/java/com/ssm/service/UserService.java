package com.ssm.service;


import com.ssm.entity.User;

public interface UserService {
    User findById(Long id);
    Integer addUser(User user);
    Integer deleteUser(Long id);
    Integer updateUser(User user);
}
