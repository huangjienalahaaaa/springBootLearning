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

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "hello,spring boot";
    }

    @RequestMapping("/boot/config")
    public @ResponseBody String config() {
        return configInfo.getPay_url() + "+++++++++++++++++++" + configInfo.getPay_notifyUrl();
    }
}
