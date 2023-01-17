package com.yutian.spring.controller;

import com.yutian.spring.service.UserService;
import com.yutian.spring.service.impl.UserServiceImpl;

public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
