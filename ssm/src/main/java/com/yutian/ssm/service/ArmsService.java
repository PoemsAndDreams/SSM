package com.yutian.ssm.service;

import com.github.pagehelper.PageInfo;
import com.yutian.ssm.pojo.Arms;

import java.util.List;

public interface ArmsService {


    List<Arms> getAllArms();

    void addArms(Arms arms);

    Arms getArmsByAid(Integer aid);

    void delArms(Integer aid);

    void updateArms(Arms arms);

    //获取员工分页信息
    PageInfo<Arms> getArmsPage(Integer pageNum);
}
