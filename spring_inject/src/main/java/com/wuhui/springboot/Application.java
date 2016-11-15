package com.wuhui.springboot;

import com.wuhui.springboot.config.SpecialConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * Created by Administrator on 2016/11/1.
 */
@MapperScan("com.wuhui.springboot.dao.mapper")
@SpringBootApplication
@ServletComponentScan
@EnableConfigurationProperties({SpecialConfig.class})
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Application  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
