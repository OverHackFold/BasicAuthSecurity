package com.pogodkin.basicauthsecurity.auth.service;

import com.pogodkin.basicauthsecurity.auth.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
