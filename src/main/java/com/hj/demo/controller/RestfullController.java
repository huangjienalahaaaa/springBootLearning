package com.hj.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //一般情况下，restfull一般都是返回json
public class RestfullController {
//    需求：http://localhost:8080/boot/order/1021/1
    @GetMapping("/boot/order/{id}/{status}")
    public Object order(@PathVariable("id") Integer id,@PathVariable("status") Integer status){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",id);
        map.put("status",status);
        return map; //map到时候会转换为json
    }
}
