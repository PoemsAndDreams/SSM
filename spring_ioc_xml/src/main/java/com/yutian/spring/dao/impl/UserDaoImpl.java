package com.yutian.spring.dao.impl;

import com.yutian.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("成功！");
    }
}
