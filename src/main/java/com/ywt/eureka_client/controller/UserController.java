package com.ywt.eureka_client.controller;

import com.ywt.eureka_client.entity.User;
import com.ywt.eureka_client.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(User user){
        return userService.createUser(user);
    }
}
