/*
package com.example.graduationproject.Controller;

import com.example.graduationproject.Domain.User;
import com.example.graduationproject.Repository.UserRepository;
import com.example.graduationproject.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdmController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String adminhome() {

        return "admin/admin";
    }

    @GetMapping("/editusers")
    public String userList(Model model) {
        model.addAttribute("allUsers", userServiceImpl.findAll());
        model.addAttribute("roleUsers", userServiceImpl.findAll());

        return "admin/editusers";
    }

    @GetMapping("/editusers/{id}")
    public String userid(@PathVariable("id") Long id, Model model) {
        User usercard = userRepository.findById(id).get();
        model.addAttribute("usercard", usercard);
        //    System.out.println(userRepository.findById(id));
        return "admin/usercard";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userServiceImpl.deleteUser(id);
        return "redirect:/admin/editusers";
    }
}
*/
