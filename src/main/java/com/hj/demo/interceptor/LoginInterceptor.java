package com.hj.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

//    进入controller之前执行该方法（还有2个方法需要去覆盖的，但是在父接口里面，定义的是default，所以下面不需要去覆盖它）
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        登录拦截器的逻辑
        System.out.println("登录拦截器......");
//        返回true，能够继续走下去
        return true;
    }
}
