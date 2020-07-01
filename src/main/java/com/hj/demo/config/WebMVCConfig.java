package com.hj.demo.config;

import com.hj.demo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration注解：相当于一个spring的xml配置文件，比如相当于applicationContext-mvc.xml
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        需要拦截的路径
        String[] addPathPatterns = {
          "/**"
        };
//        不需要拦截的路径
        String[] excludePathPatterns = {
                "/boot/hello",
                "/boot/config"
        };
//        添加登录拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
//       如果需要多个拦截器的话， 在下面添加其他拦截器
    }
}
