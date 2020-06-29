package com.hj.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**使用第二种方法读取配置文件中的自定义配置
 * @author hj
 * @create 2020-06-29 8:59
 */
@Component
@ConfigurationProperties
public class ConfigInfo {
    private  String pay_url;
    private  String pay_notifyUrl;

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
