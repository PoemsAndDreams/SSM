package com.yutian.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yutian.ssm.mapper.ArmsMapper;
import com.yutian.ssm.pojo.Arms;
import com.yutian.ssm.service.ArmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ArmsServiceImpl implements ArmsService {

    @Autowired
    private ArmsMapper armsMapper;

    @Override
    public List<Arms> getAllArms() {
        return armsMapper.getAllArms();
    }

    @Override
    public void addArms(Arms arms) {
        armsMapper.addArms(arms);
    }


    @Override
    public Arms getArmsByAid(Integer aid) {
        Arms arms = armsMapper.getArmsByAid(aid);
        return arms;
    }

    @Override
    public void delArms(Integer aid) {
        armsMapper.delArms(aid);
    }

    @Override
    public void updateArms(Arms arms) {
        armsMapper.updateArms(arms);
    }

    @Override
    public PageInfo<Arms> getArmsPage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,4);
        //查询所有的员工信息
        List<Arms> list = armsMapper.getAllArms();
        //获取分页相关数据
        PageInfo<Arms> page = new PageInfo<>(list,5);

        return page;


    }




}
