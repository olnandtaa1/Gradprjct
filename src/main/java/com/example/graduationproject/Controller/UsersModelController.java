package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.User;
import com.example.graduationproject.Model.UsersModel;
import com.example.graduationproject.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersModelController {
    //

    private final UserService userService;

    public UsersModelController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }
    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UsersModel usersModel) {
        System.out.println("Register request " + usersModel);
        UsersModel registeredUser = userService.registerUser(usersModel.getLogin(), usersModel.getEmail(), usersModel.getPassword());
        return registeredUser == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model) {
        System.out.println("Login request " + usersModel);
        UsersModel authenticatedUser = userService.authenticate(usersModel.getEmail(), usersModel.getPassword());
        if (authenticatedUser != null) {
            model.addAttribute("userLogin", authenticatedUser.getEmail());
        return "personal_page";
        } else {
            return "error_page";
        }
    }


}
