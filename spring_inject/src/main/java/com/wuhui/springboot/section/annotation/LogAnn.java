package com.wuhui.springboot.section.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/11/4.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LogAnn {

    public LogType value();
}
