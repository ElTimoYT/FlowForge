package com.flowforge.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowforge.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    

}
