package com.example.demot1.service;

import com.example.demot1.dao.UserMapper;

import com.example.demot1.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> query(){
        return userMapper.getAllByUser();
    }
}
