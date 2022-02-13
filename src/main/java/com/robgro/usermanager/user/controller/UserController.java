package com.robgro.usermanager.user.controller;

import com.robgro.usermanager.user.User;
import com.robgro.usermanager.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String showUsersList(Model model) {
        Iterable<User> listUsers = userService.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
}
