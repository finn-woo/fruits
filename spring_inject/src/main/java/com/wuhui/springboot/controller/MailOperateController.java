package com.wuhui.springboot.controller;

import com.wuhui.springboot.config.SpecialConfig;
import com.wuhui.springboot.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Created by Administrator on 2016/11/3.
 */
@RestController
@RequestMapping("/mail")
public class MailOperateController {

    private static final Logger logger = LoggerFactory.getLogger(MailOperateController.class);

    @Autowired
    private MailService mailService;

    @Autowired
    private ReloadableResourceBundleMessageSource messageSource;


    @Autowired
    private SpecialConfig specialConfig;

    @RequestMapping(value = "/createEmailIds", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//    @LogAnn(LogType.ControLog)
    public void createEmailIdTable() {
        String message = messageSource.getMessage("test.hello",
                null, Locale.SIMPLIFIED_CHINESE);
        mailService.createEmailIdTable(specialConfig.getCode());


    }

}
