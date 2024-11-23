package com.quanlytintuc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.quanlytintuc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
