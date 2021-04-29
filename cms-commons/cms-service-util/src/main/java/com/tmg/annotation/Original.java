package com.tmg.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述:注解类
 *
 * @outhor jinxin
 * @create 2019-09-18 11:30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Original {



    /**
     * 标注属性的描述
     * @return
     */
    String  value() default "";
}