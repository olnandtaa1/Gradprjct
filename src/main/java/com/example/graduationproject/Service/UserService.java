package com.example.graduationproject.Service;

import com.example.graduationproject.Model.UsersModel;
import com.example.graduationproject.Repository.UsersModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//
    private final UsersModelRepository usersModelRepository;

    public UserService(UsersModelRepository usersModelRepository) {
        this.usersModelRepository = usersModelRepository;
    }


    public UsersModel registerUser(String login, String password, String email) {
        if (login != null && email != null && password != null) {  return null;
        } else
        {UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            return usersModelRepository.save(usersModel);

/*if (usersModelRepository.findFirstByEmail(email).isPresent())
            {
                System.out.println("Duplicate email");
                return null;
            }*/


        }
    }
public UsersModel authenticate (String email, String password) {
        return usersModelRepository.findByEmailAndPassword(email, password).orElse(null);
}
}
