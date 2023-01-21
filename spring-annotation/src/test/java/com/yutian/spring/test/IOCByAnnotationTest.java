package com.yutian.spring.test;

import com.yutian.spring.controller.UserController;
import com.yutian.spring.dao.UserDao;
import com.yutian.spring.pojo.User;
import com.yutian.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean(UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean(UserDao.class);
//        System.out.println(userDao);
//        String[] names = ioc.getBeanDefinitionNames();
//        for(int i = 0;i < names.length;i++){
//            System.out.println(names[i]);
//        }
        userController.saveUser();

    }
}
