package com.yutian.springMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class protalController {

    /**
    @RequestMapping("/")
    public String protal(){
        return "index";
    }
     用下面代替
    <!--
    视图控制器：为当前的请求直接设置视图名称实现页面跳转
    若设置视图控制器，则只有视图控制器所设置的请求会被处理，其他的请求将全部404
    此时必须在配置一个标签：<mvc:annotation-driven />
    -->
    <mvc:view-controller path="/" view-name="index"></mvc:view-controller>
    */

}
