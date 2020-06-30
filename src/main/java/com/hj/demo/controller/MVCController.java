package com.hj.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author hj
 * @create 2020-06-30 8:44
 */
@RestController //RestController注解是不能跳转到页面，他只返回字符串或json.所以jsp页面的话，只能用@Controller注解，而不能用@RestController注解
public class MVCController {
    /**
     * 既支持get，又支持post
     * @return
     */
    @RequestMapping(value = "/boot/req",method = {RequestMethod.GET,RequestMethod.POST})
    public Object req(){
        return "req";
    }

    /**
     * 只支持get
     * @return
     */
    @GetMapping(value = "/boot/get")
    public Object get(){
        return "get";
    }

    /**
     * 只支持post
     * @return
     */
    @PostMapping(value = "/boot/post")
    public Object post(){
        return "post";
    }

    /**
     * 只支持put
     * @return
     */
    @PostMapping(value = "/boot/put")
    public Object put(){
        return "put";
    }

    /**
     * 只支持delete
     * @return
     */
    @PostMapping(value = "/boot/delete")
    public Object delete(){
        return "delete";
    }

}
