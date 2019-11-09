package com.example.demot1.controller;

import com.example.demot1.pojo.User;
import com.example.demot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/query")
    public List<User> query(){
        return userService.query();
    }
}
