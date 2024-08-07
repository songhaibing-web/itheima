package com.sky.annotation;

import com.sky.enumeration.OperationType;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用来标记哪些方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD) // 当前注解只能加在方法上，通知所应用的对象
@Retention(RetentionPolicy.RUNTIME) //
public @interface AutoFill {

    // 数据库操作类型：UPDATE INSERT
    OperationType value();
}
