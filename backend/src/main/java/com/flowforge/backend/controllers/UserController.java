package com.flowforge.backend.controllers;

import com.flowforge.backend.entities.User;
import com.flowforge.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> list() {
        return this.userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return this.userService.findById(id).orElse(null);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return this.userService.save(user);
    }
}
