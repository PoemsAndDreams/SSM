package com.yutian.mybatis.mapper;

import com.yutian.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String,Object>> getAllUserToMap_01();

    @MapKey("id")
    Map<String,Object> getAllUserToMap_02();


}
