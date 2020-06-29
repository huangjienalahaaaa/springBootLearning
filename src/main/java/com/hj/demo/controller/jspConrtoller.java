package com.hj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hj
 * @create 2020-06-29 9:59
 */
@Controller
public class jspConrtoller {
    @RequestMapping("/boot/jsp")
    public  String jsp(Model model){
        model.addAttribute("data","SpringBoot前端页面使用jps");
//        跳转页面
        return "index";
    }
}
