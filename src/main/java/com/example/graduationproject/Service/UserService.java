package com.example.graduationproject.Service;

import com.example.graduationproject.Domain.User;

public interface UserService {
    User save(User user);

    User findByEmail(String email);

    User findUserByUsername(String username);
}
