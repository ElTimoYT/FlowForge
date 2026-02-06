package com.flowforge.backend.services;

import com.flowforge.backend.entities.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    Optional<User> update(Long id, User user);
    void delete(Long id);
}
