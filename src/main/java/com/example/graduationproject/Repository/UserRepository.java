package com.example.graduationproject.Repository;

import com.example.graduationproject.Domain.User;
import com.example.graduationproject.Model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//
public interface UserRepository extends JpaRepository<User, Integer> {



}
