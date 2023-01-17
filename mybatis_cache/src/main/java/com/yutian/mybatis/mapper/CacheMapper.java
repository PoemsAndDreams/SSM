package com.yutian.mybatis.mapper;

import com.yutian.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CacheMapper {

    Emp getEmpById(@Param("empId") Integer empId);

}
