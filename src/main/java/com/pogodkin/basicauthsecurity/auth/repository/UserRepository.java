package com.pogodkin.basicauthsecurity.auth.repository;

import com.pogodkin.basicauthsecurity.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

