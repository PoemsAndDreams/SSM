package com.yutian.mybaties.test;

import com.yutian.mybatis.mapper.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void testInsert() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.insertUser();
        System.out.println("结果：" + result);
        sqlSession.commit();
        sqlSession.close();
        //Git : hot-fix测试
        //Git : hot-fix merge master-测试01
        //Git : master merge hot-fix-conflict-测试02


    }
}
