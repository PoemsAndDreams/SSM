package com.yutian.ssm.controller;


import com.github.pagehelper.PageInfo;
import com.yutian.ssm.pojo.Arms;
import com.yutian.ssm.service.ArmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ArmsController {

    @Autowired
    private ArmsService armsService ;

    @RequestMapping(value = "/arms/page/{pageNum}",method = RequestMethod.GET)
    public String getArmsPage(@PathVariable("pageNum") Integer pageNum,Model model){
        //获取分页相关数据

        PageInfo<Arms> page = armsService.getArmsPage(pageNum);
        model.addAttribute("page",page);
        return "index";

    }

//    @RequestMapping(value = "/arms",method = RequestMethod.GET)
//    private String getAllArms(Model model){
//        List<Arms> list = armsService.getAllArms();
//        model.addAttribute("list",list);
//        return "index";
//    }

    @RequestMapping(value = "/arms/{aid}",method = RequestMethod.GET)
    private String toUpdate(@PathVariable("aid") Integer aid,Model model) {
        Arms arms = armsService.getArmsByAid(aid);
        model.addAttribute("arms",arms);
        return "edit";
    }

    @RequestMapping(value = "/arms",method = RequestMethod.PUT)
    private String edit(Arms arms) {
        armsService.updateArms(arms);
        return "redirect:/arms/page/1";
    }

//    @RequestMapping(value = "/arms/{aid}",method = RequestMethod.DELETE)
    @RequestMapping(value = "/arms/del/{aid}")
    private String del(@PathVariable("aid") Integer aid) {
        armsService.delArms(aid);
        return "redirect:/arms/page/1";
    }

    @RequestMapping(value = "/arms/add",method = RequestMethod.POST)
    private String add(Arms arms) {
        armsService.addArms(arms);
        return "redirect:/arms/page/1";
    }


}
