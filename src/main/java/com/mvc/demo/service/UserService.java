package com.mvc.demo.service;


import com.mvc.demo.entity.User;

public interface UserService {
    User findUserByEmail(String email);

    void saveUser(User user);
}
