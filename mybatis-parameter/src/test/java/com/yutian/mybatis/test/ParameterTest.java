package com.yutian.mybatis.test;

import com.yutian.mybatis.Util.SqlSessionUtil;
import com.yutian.mybatis.mapper.UserMapper;
import com.yutian.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParameterTest {
    @Test
    public void testGetUseByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("Tom");
        System.out.println(user);

    }

    @Test
    public void testcheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("Tom","123");
        System.out.println(user);

    }

    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username","Tom");
        map.put("password","123");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);

    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "Jack", "123456", 33, "男", "123@qq.com");
        mapper.insertUser(user);


    }




    @Test
    public void testcheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("Tom","123");
        System.out.println(user);

    }



}
