package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User findByLogin(String login);




}
