package com.yutian.mybatis.test;

import com.yutian.mybatis.Util.SqlSessionUtil;
import com.yutian.mybatis.mapper.CacheMapper;
import com.yutian.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {

    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
        sqlSession.close();
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2= mapper1.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();


    }

    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println(emp1);
//        sqlSession.clearCache();
        Emp emp2 = mapper.getEmpById(1);
        System.out.println(emp2);

        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp3 = mapper2.getEmpById(1);
        System.out.println(emp3);
        Emp emp4 = mapper.getEmpById(1);
        System.out.println(emp4);

    }
}
