package com.example.Springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Springboot.crud.model.User;
public interface UserRepository extends JpaRepository<User, Long> {


}