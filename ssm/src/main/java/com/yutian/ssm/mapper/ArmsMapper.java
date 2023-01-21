package com.yutian.ssm.mapper;

import com.yutian.ssm.pojo.Arms;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArmsMapper {


    List<Arms> getAllArms();

    //根据aid获取信息
    Arms getArmsByAid(@Param("aid") Integer aid);

    //修改库存
    void updateArms(Arms arms);

    //删除特定库存记录
    void delArms(@Param("aid") Integer aid);

    //新增库存
    void addArms(Arms arms);


}
