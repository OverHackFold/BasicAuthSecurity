package com.pogodkin.basicauthsecurity.auth.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
