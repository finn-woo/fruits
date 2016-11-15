package com.wuhui.springboot.service.impl;

import com.wuhui.springboot.dao.MailDao;
import com.wuhui.springboot.section.annotation.LogAnn;
import com.wuhui.springboot.section.annotation.LogType;
import com.wuhui.springboot.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/3.
 */
@Service("mailService")
public class MailServiceImpl implements MailService {

    private static final Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);

    @Autowired
    private MailDao mailDao;

    @LogAnn(LogType.ServiceLog)
    public void createEmailIdTable(String bankCode) {
        mailDao.createEmailIdTable(bankCode);
    }
}
