package com.hj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//要用@Controller注释表示这个是controller
@Controller
public class HelloController {

    @RequestMapping("/boot/hello")
//    public String hello(){
//        return "hello,spring boot";
//    }
//    因为这里是返回字符串，而不是返回一个页面，所以要在public String hello()中加入@ResponseBody
    public @ResponseBody String hello(){
        return "hello,spring boot";
    }
}
