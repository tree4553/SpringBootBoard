package com.example.Board.controller;

import com.example.Board.model.User;
import com.example.Board.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "/account/login";
    }

    @PostMapping("/register")
    public String register(User user) {
        userService.save(user);
        return "account/login";
    }
}
