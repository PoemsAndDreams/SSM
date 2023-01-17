package com.yutian.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yutian.mybatis.Util.SqlSessionUtil;
import com.yutian.mybatis.mapper.EmpMapper;
import com.yutian.mybatis.pojo.Emp;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {

    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Page<Object> page = PageHelper.startPage(1, 5);
        List<Emp> list = mapper.selectByExample(null);
        PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
        list.forEach(System.out::println);
        System.out.println(pageInfo);

    }

}
