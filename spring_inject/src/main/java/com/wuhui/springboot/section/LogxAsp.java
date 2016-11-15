package com.wuhui.springboot.section;

import com.wuhui.springboot.section.annotation.LogAnn;
import com.wuhui.springboot.section.annotation.LogType;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/4.
 */
@Aspect
@Component
public class LogxAsp {
    @Around("@annotation(com.wuhui.springboot.section.annotation.LogAnn)")
    private Object writeServerAuditLog(ProceedingJoinPoint jp) throws Throwable {
        Method method = ((MethodSignature) jp.getSignature()).getMethod();
        if (method == null || !method.isAnnotationPresent(LogAnn.class)) {
            return jp.proceed();
        }
        final LogAnn logAnn = method.getAnnotation(LogAnn.class);
        method.getParameters();
        Object[] args = jp.getArgs();
        LogType logType = logAnn.value();
        String s = logType.MaskText(String.valueOf(args[0]));
        // s2: return log
        final Object retVal = jp.proceed();
        return retVal;
    }
}
