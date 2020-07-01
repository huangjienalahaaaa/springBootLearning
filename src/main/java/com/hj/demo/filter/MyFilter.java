package com.hj.demo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//方法一：使用注解，其实就是将拦截器变成了容器中的一个bean，所以要去application方法中进行扫描
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("您已经进入filter过滤器，您的请求正常，请继续遵守规则...");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
