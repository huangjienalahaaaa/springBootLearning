package com.hj.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**使用第二种方法读取配置文件中的自定义配置
 * @author hj
 * @create 2020-06-29 8:59
 */

@Component
//使用@ConfigurationProperties注解：将配置文件中对应的配置拿到这个类中来，然后我们在其他地方就可以拿到它了。比如说我们要在HelloController文件中拿到这里的信息，那么我们就要用上面这个注解，讲其改成Spring容器中的一个bean对象,一个组件，那么别的地方就可以将它注入进来（通过@AutoWire）
//下面@ConfigurationProperties会出红线，虽然不对结果有什么影响，但是如果你想要去掉这哥红线，就要去下一个包：spring-boot-configuration-processor
@ConfigurationProperties
public class ConfigInfo {

//    1.定义配置文件中的配置项
    private  String pay_url;
    private  String pay_notifyUrl;

//2.生成get和set方法

    public String getPay_url() {
        return pay_url;
    }

    public void setPay_url(String pay_url) {
        this.pay_url = pay_url;
    }

    public String getPay_notifyUrl() {
        return pay_notifyUrl;
    }

    public void setPay_notifyUrl(String pay_notifyUrl) {
        this.pay_notifyUrl = pay_notifyUrl;
    }
}
