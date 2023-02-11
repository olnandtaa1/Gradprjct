package com.example.graduationproject.Repository;

import com.example.graduationproject.Model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersModelRepository extends JpaRepository<UsersModel, Integer> {



    Optional<UsersModel> findByEmailAndPassword(String email, String password);

    //   Optional<UsersModel> findFirstByEmailAndPassword (String email, String Password);
}
