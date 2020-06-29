package com.hj.demo.controller;

import com.hj.demo.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

//    1. 使用注解的方式读取配置文件中的自定义字段
//        @Value("${pay_url}")
//        private  String pay_url;
//
//        @Value("${pay_notifyUrl}")
//        private  String pay_notifyUrl;


//    2. 使用第二种方式来读取配置文件中的自定义字段
    @Autowired
    private ConfigInfo configInfo;





    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "hello,spring boot";
    }

//    验证配置文件中的自定义配置是否能读到
    @RequestMapping("/boot/config")
    public @ResponseBody String config() {
//        return pay_url + "----------" + pay_notifyUrl;
        return configInfo.getPay_url() + "+++++++++++++++++++" + configInfo.getPay_notifyUrl();
    }
}
