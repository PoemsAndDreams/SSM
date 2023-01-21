package com.yutian.spring.dao.impl;

import com.yutian.spring.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("成功");
    }
}
