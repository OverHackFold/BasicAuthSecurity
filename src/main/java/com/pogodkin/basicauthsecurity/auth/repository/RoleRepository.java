package com.pogodkin.basicauthsecurity.auth.repository;


import com.pogodkin.basicauthsecurity.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

