package com.yutian.spring.controller;


import com.yutian.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller("controller")
@Controller
public class UserController {

//    @Autowired(required = false)
    @Autowired
//    @Qualifier("userServiceImpl")
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
