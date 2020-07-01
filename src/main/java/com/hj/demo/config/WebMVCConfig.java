package com.hj.demo.config;

import com.hj.demo.filter.MyFilter;
import com.hj.demo.servlet.HeServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //相当于一个spring的xml配置文件，比如相当于applicationContext-mvc.xml
public class WebMVCConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPathPatterns = {
                "/**"
        };
        String[] excludePathPatterns = {
                "/boot/hello",
                "/boot/config"
        };
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }

//    配置一个servlet（原来是在web.xml中配置，但是springbooot中没有web.xml文件，所以是在这里配置）
    @Bean
    public ServletRegistrationBean heServletRegistrationBean(){
        ServletRegistrationBean registration = new ServletRegistrationBean(new HeServlet(),"/servlet/heServlet");
        return registration;
    }
    //    配置一个Filter（原来是在web.xml中配置，但是springbooot中没有web.xml文件，所以是在这里配置）
    @Bean
    public FilterRegistrationBean myFilterRegistration(){
        FilterRegistrationBean registration = new FilterRegistrationBean(new MyFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }
}
