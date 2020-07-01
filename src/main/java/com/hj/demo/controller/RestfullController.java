package com.hj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfullController {
    //   返回字符串或json
    @GetMapping("/boot/index")
    public @ResponseBody String index(){
        return "Spring Boot War";
    }

    //   返回jsp
    @GetMapping("/boot/jsp")
    public @ResponseBody String jsp(Model model){
        model.addAttribute("data","springBoot War");
        return "abc";
    }
}



