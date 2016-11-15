package com.wuhui.springboot.dao.impl;

import com.wuhui.springboot.dao.MailDao;
import com.wuhui.springboot.dao.mapper.TestMapper;
import com.wuhui.springboot.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/11/3.
 */
@Repository("mailDao")
public class MailDaoImpl implements MailDao {

    @Autowired
    private TestMapper testMapper;

    public void createEmailIdTable(String bankCode) {
        Test test = testMapper.selectByPrimaryKey(1);
        System.out.println(test);
    }
}
