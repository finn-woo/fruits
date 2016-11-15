package com.wuhui.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2016/11/3.
 */
@ConfigurationProperties(prefix = "bank",locations="classpath:properties/buildmail.properties")
public class SpecialConfig {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
