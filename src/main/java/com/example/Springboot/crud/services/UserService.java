package com.example.Springboot.crud.services;

import java.util.List;
import java.util.Optional;
import com.example.Springboot.crud.model.User

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}