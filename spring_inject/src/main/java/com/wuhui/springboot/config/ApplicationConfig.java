package com.wuhui.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import java.util.Locale;

/**
 * Created by Administrator on 2016/11/4.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver resolver = new CookieLocaleResolver();
        resolver.setDefaultLocale(Locale.SIMPLIFIED_CHINESE);
        resolver.setCookieName("Language");
        resolver.setCookieMaxAge(604800);
        return resolver;
    }


    @Bean
    public ReloadableResourceBundleMessageSource getMessageSource(){
        ReloadableResourceBundleMessageSource  messageSource = new ReloadableResourceBundleMessageSource ();
        messageSource.setBasename("classpath:messages/message");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(3600);
        messageSource.setUseCodeAsDefaultMessage(false);
        return messageSource;
    }
}
